package com.herokuapp.theinternet.pages;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePageObject {

	
	//locators here
	private By avatarLocator = By.xpath("//div[@class='figure']");
	private By viewProfileLinkLocator = By.xpath("/html//div[@id='content']//a[@href='/users/2']");
	
	private String pageUrl = "https://the-internet.herokuapp.com/hovers";
	
	public HoversPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	/** Open HoverPage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}
	
	public void openUserProfile(int i) {
		List<WebElement> avatars =findAll(avatarLocator);
		WebElement specifiedUserAvatar = avatars.get( 1);
		hoverOverElement(specifiedUserAvatar);
		specifiedUserAvatar.findElement(viewProfileLinkLocator).click();
	}
	
}

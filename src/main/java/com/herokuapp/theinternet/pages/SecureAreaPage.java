package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage extends BasePageObject {

	private String pageUrl = "https://the-internet.herokuapp.com/secure";

	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	private By message = By.id("flash");

	SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** verify that log out button is visible */

	public boolean isLogOutButtonVisible() {
		return find(logOutButton).isDisplayed();
	}

	/** get the text from confirmation message */

	public String getSuccessMessage() {
		return find(message).getText();
	}
	
	/** get the the URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}
}

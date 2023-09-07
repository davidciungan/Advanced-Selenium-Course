package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage extends BasePageObject {

	private By newWindowTextLocator = By.xpath("//div[@class='example']/h3[.='New Window']");

	public NewWindowPage(WebDriver driver, Logger log) {
		super(driver, log);

	}

	public String getNewWindowText() {
		String textMessage = find(newWindowTextLocator).getText();
		return textMessage;

	}
}

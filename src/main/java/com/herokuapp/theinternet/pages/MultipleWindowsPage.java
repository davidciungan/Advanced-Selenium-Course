package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends BasePageObject {

	private By clickHereLinkLocator = By.linkText("Click Here");
	
	public MultipleWindowsPage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}

	public void ClickNewWindow() {
		log.info("Clicking on the Click Here link");
		click(clickHereLinkLocator);
	}
	
	public NewWindowPage switchToNewWindowPage() {
		log.info("Looking for 'New Window' page");
		switchToWindowWithTitle("New Window");
		return new NewWindowPage(driver, log);
	}
}

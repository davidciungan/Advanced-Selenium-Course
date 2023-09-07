package com.herokuapp.theinternet.multiplewindowspagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.MultipleWindowsPage;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class MultipleWindowsTests extends TestUtilities {

	@Test
	public void newWindowTest() {
		// open the homepage
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// click on MultipleWindows Link
		MultipleWindowsPage multipleWindowsPage = welcomePage.clickMultipleWindowsLink();

		// click on New Window
		multipleWindowsPage.ClickNewWindow();

		// Find and switch to new window page
		NewWindowPage newWindowPage = multipleWindowsPage.switchToNewWindowPage();

		String pageSource = newWindowPage.getCurrentPageSource();

		// Verification that new page contains expected text in source
		Assert.assertTrue(pageSource.contains("New Window"), "New page source doesn't contain expected text");
	}

}

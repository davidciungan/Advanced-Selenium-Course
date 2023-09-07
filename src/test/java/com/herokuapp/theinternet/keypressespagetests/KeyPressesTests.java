package com.herokuapp.theinternet.keypressespagetests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class KeyPressesTests extends TestUtilities {

	@Test
	public void checkPressedKey() {
		
		// open homepage
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		//go to keypresses
		KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
		//press Enter key
		keyPressesPage.pressKey(Keys.ARROW_RIGHT);
		
		// Get Results text
				String result
				= keyPressesPage.getResultText();

				// Verify Result text is expected
		Assert.assertEquals( result, "You entered: RIGHT");
			}

	@Test
	public void pressKeyWithActionsTest() {
		log.info("Starting pressKeyWithActionsTest");

		// open homepage
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		// go to keypresses
		KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();

		// Push keyboard key
		keyPressesPage.pressKeyWithActions(Keys.SPACE);

		// Get Results text
		String result = keyPressesPage.getResultText();

		// Verify Result text is expected
		Assert.assertTrue(result.equals("You entered: SPACE"),
				"result is not expected. \nShould be 'You entered: ENTER', but it is '" + result + "'");
	}
}

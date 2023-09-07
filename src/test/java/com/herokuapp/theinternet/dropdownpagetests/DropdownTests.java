package com.herokuapp.theinternet.dropdownpagetests;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DropdownTests extends TestUtilities {

	@Test

	public void selectOptionTwo() {

		// go to Homepage
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// click on dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();

		// from dropdown select option 2
		dropdownPage.selectOption(2);
		
		//Verify that option 2 is selected
		dropdownPage.getSelectedOption();
	}

}
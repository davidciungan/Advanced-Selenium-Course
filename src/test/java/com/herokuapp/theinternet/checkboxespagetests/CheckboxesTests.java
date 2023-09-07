package com.herokuapp.theinternet.checkboxespagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class CheckboxesTests extends TestUtilities {
 
	
	@Test
	
	public void selectingTwoCheckboxesTest() {
		// open welcome page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
		
		// click on checkboxes link
		CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
		
		//select all checboxes
		checkboxesPage.selectAllCheckboxes();
		//verify all checkboxes
	Assert.assertTrue(checkboxesPage.areAllBoxesChecked(), "CHeckboxes are not checked");
		
	}
	
}

package com.herokuapp.theinternet.hovertests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoversPage;

public class HoversTests extends TestUtilities {

	
	
	@Test
	public void user2ProfileTest() {
	HoversPage hoversPage = new HoversPage(driver, log);
	hoversPage.openPage();
	
	//hover over and click user 2
	hoversPage.openUserProfile(1);
	
	//verification
	Assert.assertTrue(hoversPage.getCurrentUrl().contains("/users/2"),
			"Url of opened page is not expected User 1 page url");
}


}
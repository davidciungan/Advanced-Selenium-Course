package com.herokuapp.theinternet.editorpagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class EditorTests extends TestUtilities {

	@Test
	public void defaultEditorValueTest() {

		// go to Homepage
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		
		//scroll to the bottom of the page
		welcomePage.scrollToBottom();
		
		// go to Editor page
		EditorPage editorPage = welcomePage.clickWYSIWYGEditorLink();
		// get default text
		String editorText = editorPage.getEditorText();
		// verify text
		Assert.assertTrue(editorText.equals("Your content goes here."),
				"Editor default text is not expected. It is: " + editorText);
	}

}

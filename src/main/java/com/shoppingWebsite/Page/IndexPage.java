package com.shoppingWebsite.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppingWebsite.Base.BaseClass;

public class IndexPage extends BaseClass {
	@FindBy(css = ".header_user_info")
	WebElement clickSignIn;

	public IndexPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickSignInButton() {

		clickSignIn.click();
		return new LoginPage();

	}
}

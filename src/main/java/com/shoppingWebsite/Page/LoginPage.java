package com.shoppingWebsite.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppingWebsite.Base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "email")
	WebElement inputEmail;

	@FindBy(id = "passwd")
	WebElement inputPassword;

	@FindBy(id = "SubmitLogin")
	WebElement signButton;

	public LoginPage() {
		waitForDocumentCompleteState(10);
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId() {

		inputEmail.sendKeys(prop.getProperty("emailid"));
	}

	public void enterPassword() {

		inputPassword.sendKeys(prop.getProperty("password"));
	}

	public MyStorePage clickSignInButton() {
		signButton.click();
		return new MyStorePage();
	}

	public MyStorePage configuration() {

		enterEmailId();
		enterPassword();
		return clickSignInButton();
	}

}

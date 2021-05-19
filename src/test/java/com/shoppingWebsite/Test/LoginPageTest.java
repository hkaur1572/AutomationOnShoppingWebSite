package com.shoppingWebsite.Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingWebsite.Base.BaseClass;
import com.shoppingWebsite.Page.IndexPage;
import com.shoppingWebsite.Page.LoginPage;

public class LoginPageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		indexpage = new IndexPage();
		indexpage.clickSignInButton();
		loginpage = new LoginPage();
	}

	@Test
	public void signIn() {

		loginpage.configuration();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}
}

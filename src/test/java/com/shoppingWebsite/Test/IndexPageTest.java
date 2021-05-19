package com.shoppingWebsite.Test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingWebsite.Base.BaseClass;
import com.shoppingWebsite.Page.IndexPage;

public class IndexPageTest extends BaseClass {
	IndexPage indexpage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		indexpage = new IndexPage();

	}

	@Test
	public void SignInTest() {
		indexpage.clickSignInButton();

	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}

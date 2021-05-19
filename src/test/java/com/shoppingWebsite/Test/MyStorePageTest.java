package com.shoppingWebsite.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingWebsite.Base.BaseClass;
import com.shoppingWebsite.Page.IndexPage;
import com.shoppingWebsite.Page.LoginPage;
import com.shoppingWebsite.Page.MyStorePage;

public class MyStorePageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	MyStorePage mystorepage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		indexpage = new IndexPage();
		indexpage.clickSignInButton();
		loginpage = new LoginPage();
		loginpage.configuration();
		mystorepage = new MyStorePage();
	}

	@Test
	public void AddTshirtToCart() {
		mystorepage.selectTshirt();
	
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}
}

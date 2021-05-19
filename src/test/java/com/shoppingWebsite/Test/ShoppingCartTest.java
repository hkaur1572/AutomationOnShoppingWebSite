package com.shoppingWebsite.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.shoppingWebsite.Base.BaseClass;
import com.shoppingWebsite.Page.IndexPage;
import com.shoppingWebsite.Page.LoginPage;
import com.shoppingWebsite.Page.MyStorePage;
import com.shoppingWebsite.Page.ShoppingCartPage;

public class ShoppingCartTest extends BaseClass {

	IndexPage indexpage;
	LoginPage loginpage;
	MyStorePage mystorepage;
	ShoppingCartPage shoppingcartpage;
	MyStorePageTest mystorepagetest;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		indexpage = new IndexPage();
		indexpage.clickSignInButton();
		loginpage = new LoginPage();
		loginpage.configuration();
		mystorepage = new MyStorePage();
		mystorepagetest = new MyStorePageTest();
		mystorepage.selectTshirt();
	}

	@Test

	public void ProceedToCheckout() {

		shoppingcartpage = new ShoppingCartPage();

		shoppingcartpage.checkout();
		
	}

	@AfterMethod
	public void afterMethod() {
	driver.quit();

	}
}

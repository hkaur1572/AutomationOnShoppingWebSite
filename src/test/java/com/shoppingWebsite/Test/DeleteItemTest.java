package com.shoppingWebsite.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingWebsite.Base.BaseClass;
import com.shoppingWebsite.Page.DeleteItemPage;
import com.shoppingWebsite.Page.IndexPage;
import com.shoppingWebsite.Page.LoginPage;
import com.shoppingWebsite.Page.MyStorePage;
import com.shoppingWebsite.Page.ShoppingCartPage;

public class DeleteItemTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	MyStorePage mystorepage;
	ShoppingCartPage shoppingcartpage;

	DeleteItemPage deleteitempage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		indexpage = new IndexPage();
		indexpage.clickSignInButton();
		loginpage = new LoginPage();
		loginpage.configuration();
		mystorepage = new MyStorePage();

		mystorepage.selectTshirt();
	}

	@Test

	public void deleteItemFromShoppingCart() {
		deleteitempage = new DeleteItemPage();

		deleteitempage.clickOnDeleteButton();
		deleteitempage.getUrlofDeleteItemPage();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}
}

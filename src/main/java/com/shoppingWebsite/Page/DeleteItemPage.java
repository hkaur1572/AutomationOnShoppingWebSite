package com.shoppingWebsite.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shoppingWebsite.Base.BaseClass;

public class DeleteItemPage extends BaseClass {
	@FindBy(css = ".icon-trash")
	WebElement DeleteButton;
	

	public DeleteItemPage() {

		waitForDocumentCompleteState(10);
		PageFactory.initElements(driver, this);

	}

	public void clickOnDeleteButton() {

		DeleteButton.click();
	}

	public void getUrlofDeleteItemPage() {

		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=order");
	}
}

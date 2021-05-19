package com.shoppingWebsite.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.shoppingWebsite.Base.BaseClass;

public class ShoppingCartPage extends BaseClass {
	JavascriptExecutor jse;

	@FindBy(id = "total_price")
	WebElement TotalPrice;
	@FindBy(linkText = "Proceed to checkout")
	WebElement ProceedToCheckOutButton;
	@FindBy(css = "p[class='address_add submit']")
	WebElement UpdateDeliveryAddressButton;
	@FindBy(css = "select[name='id_address_delivery']")
	WebElement NameForDeliveryAddress;

	@FindBy(id = "id_address_delivery")
	WebElement selectAddress;

	@FindBy(id = "addressesAreEquals")
	WebElement selectDilveryAddress;
	@FindBy(id = "id_address_invoice")
	WebElement BillingAddress;

	@FindBy(css = "button[type='submit'][name='processAddress']")
	WebElement ProcessAddress;

	@FindBy(id = "cgv")
	WebElement TermsAndservice;

	@FindBy(css = "button[name='processCarrier']")
	WebElement Shipping;

	@FindBy(css = "a[title='Pay by bank wire']")
	WebElement PaymentMethod;
	
	

	@FindBy(css = "button[class='button btn btn-default button-medium'][type='submit']")
	WebElement ConfirmOrder;
	
	@FindBy(css = "div[class='box']")
	WebElement ConfirmationMessage;
	
	public ShoppingCartPage() {

		waitForDocumentCompleteState(10);
		PageFactory.initElements(driver, this);

	}

	public void getTotalPrice() {

		Assert.assertEquals(TotalPrice.getText(), "$35.02");
	}

	public void clickOnProceedToCheckOutButton() {

		ProceedToCheckOutButton.click();
	}

	public void selectNameForDeliveryAddress() {
		Select select = new Select(selectAddress);
		select.selectByVisibleText("harpreet");
	}

	public void selectDeliveryAddress() {
		selectDilveryAddress.click();

	}

	public void selectNameForBillingAddress() {
		Select select = new Select(BillingAddress);
		select.selectByVisibleText("harpreet kaur");
	}

	public void clickOnProcessAddress() {
//	jse.executeScript("arguments[0].scrollIntoView(true);", ProcessAddress);
		ProcessAddress.click();
	}

	public void clickOnTermsAndService() {
		TermsAndservice.click();
	}

	public void clickOnShippingProcess() {
//		jse.executeScript("arguments[0].scrollIntoView(true);", Shipping);
		Shipping.click();
	}

	public void clickOnPaymentButton() {
		PaymentMethod.click();
	}
	public void clickOnConfirmMyOrderButton() {
		ConfirmOrder.click();
		
		
		
	}
	public void getConfirmationMessage() {
	logger.info("Confirmation Message "+ConfirmationMessage.getText());
		
		
		
	}
	public void checkout() {
		getTotalPrice();
		clickOnProceedToCheckOutButton();
		selectNameForDeliveryAddress();
		selectDeliveryAddress();
		selectNameForBillingAddress();
		clickOnProcessAddress();

		clickOnTermsAndService();
		clickOnShippingProcess();
		clickOnPaymentButton();
	clickOnConfirmMyOrderButton();
	getConfirmationMessage();
	}
}

package com.shoppingWebsite.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.shoppingWebsite.Base.BaseClass;

public class MyStorePage extends BaseClass {
	Actions action;
	Select select;
	@FindBy(css = ".sf-with-ul")
	WebElement womenButton;

	@FindBy(linkText = "T-shirts")
	WebElement Tshirts;
	@FindBy(linkText = "Faded Short Sleeve T-shirts")
	WebElement shortSleeve;
	@FindBy(css = "a[class='button lnk_view btn btn-default']")
	WebElement More;
	@FindBy(css = "input[class='text']")
	WebElement Quantity;
	@FindBy(id = "group_1")
	WebElement SelectSize;
	@FindBy(css = "button[class='exclusive']")
	WebElement AddToCart;

	@FindBy(css = "a[class='btn btn-default button button-medium']")
	WebElement ProceedToCheckout;
	@FindBy(css = ".page-heading")
	WebElement GetText;

	public MyStorePage() {

		waitForDocumentCompleteState(10);
		PageFactory.initElements(driver, this);

	}

	public void hoverOnWomenButton() {
		action = new Actions(driver);
		action.moveToElement(womenButton).perform();

	}

	public void clickOnTshirts() {
		Tshirts.click();
	}

	public void hoverOnshortSleeve() {
		action = new Actions(driver);
		action.moveToElement(shortSleeve).perform();
	}

	public void clickOnMore() {
		More.click();
	}

	public void selectQuantity() {
		Quantity.clear();
		Quantity.sendKeys("2");
	}

	public void selectSize() {
		select = new Select(SelectSize);

		select.selectByVisibleText("M");
	}

	public void addToCart() {
		AddToCart.click();
	}

	public ShoppingCartPage clickOnProceedToCheckout() {
		ProceedToCheckout.click();
		return new ShoppingCartPage();
	}

	public ShoppingCartPage selectTshirt() {

		hoverOnWomenButton();

		clickOnTshirts();

		hoverOnshortSleeve();

		clickOnMore();

		selectQuantity();

		selectSize();

		addToCart();

	return	clickOnProceedToCheckout();
	}
}

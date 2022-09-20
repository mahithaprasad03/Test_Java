package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage{
	
	public ShoppingCart(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(className="cart-label")
	WebElement shoppingCart;
	
	public void clickCart() {
		clickAction(shoppingCart);
	}
	
	
	@FindBy(xpath="//div/..//div[contains(text(),'empty')]")
	public
	WebElement empty;
	
	
}

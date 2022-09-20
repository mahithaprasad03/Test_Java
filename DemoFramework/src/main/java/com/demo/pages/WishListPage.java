package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//span[@class='cart-label'])[2]")
	WebElement wishList;
	
	public void clickWishList() {
		
		clickAction(wishList);
	}
	
	@FindBy(xpath="//div[@class='wishlist-content']")
	public
	WebElement wishListEmpty;

}

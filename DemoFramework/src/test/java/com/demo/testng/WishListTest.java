package com.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pages.WishListPage;

public class WishListTest extends BaseTest{

	@Test
	public void checkWishListEmpty() {
		
		WishListPage wp = new WishListPage(driver);
		wp.clickWishList();
		//Assert.assertTrue(wp.wishListEmpty.isDisplayed());
		Assert.assertTrue(wp.wishListEmpty.isDisplayed(), "wishlist is not empty");
		if(wp.wishListEmpty.getText().contains("empty")) {
			
			System.out.println("wishlist is empty");
		}
	}
}

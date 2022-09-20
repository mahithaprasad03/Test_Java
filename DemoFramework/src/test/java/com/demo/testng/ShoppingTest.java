package com.demo.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demo.pages.ShoppingCart;

public class ShoppingTest extends BaseTest{
	
	@Test
	public void checkShoppingCartEmpty() {
		
		ShoppingCart sc = new ShoppingCart(driver);
		sc.clickCart();
		Assert.assertTrue(sc.empty.isDisplayed());	
				
		if(sc.empty.getText().contains("empty")) {
			
			System.out.println("cart is empty");
		}
		
	}

}

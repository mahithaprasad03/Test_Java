package com.demo.testng;

import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.generic.ExcelLibrary;
import com.demo.pages.WelcomePage;

public class WelcomeTest extends BaseTest {

	
	
	@Test(dataProvider="searchvalue")
	public void searchItem(String value) {
		
		WelcomePage wp = new WelcomePage(driver);
		wp.search_item(value);		
	}
	
	@Test
	public void menuComputers() {
		
		WelcomePage wp = new WelcomePage(driver);		
		Actions action = new Actions(driver);
		action.moveToElement(wp.computers).build().perform();
		action.moveToElement(wp.notebooks).click().perform();		
	}
	
	@Test
	public void menuElectronics() {
		WelcomePage wp = new WelcomePage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(wp.electronics).build().perform();
		action.moveToElement(wp.cellPhones).click().perform();
	}
	
	@Test
	public void jewelrytitle() {
		WelcomePage wp = new WelcomePage(driver);
		wp.clickJewelry();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Demo Web Shop. Jewelry", driver.getTitle());
	}
	
	@Test
	public void followUs() throws InterruptedException {
		WelcomePage wp = new WelcomePage(driver);
		String parent = driver.getWindowHandle();
		wp.clickLinks();
		Set<String> link = driver.getWindowHandles();
		for(String tab:link) {
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());			
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@DataProvider(name="searchvalue")
	public Object[][] loginData() throws IOException {
		
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("Demo_Search");	
		
	}

}

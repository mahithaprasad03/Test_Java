package com.demo.testng;

import java.io.IOException;

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
	
	
	@DataProvider(name="searchvalue")
	public Object[][] loginData() throws IOException {
		
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("Demo_Search");	
		
	}

}

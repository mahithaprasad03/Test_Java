package com.demo.testng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.generic.ExcelLibrary;
import com.demo.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider="loginUserData")
	public void loginUser(String email, String password) {
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin();
		lp.enter_loginEmail(email);
		lp.enter_loginPassword(password);
		lp.enter_loginButton();
		
	}
	
	@DataProvider(name="loginUserData")
	public Object[][] loginData() throws IOException {
		
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("Demo_Login");	
		
	}
		
	

}

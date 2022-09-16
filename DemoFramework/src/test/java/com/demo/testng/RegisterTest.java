package com.demo.testng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.generic.ExcelLibrary;
import com.demo.pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	@Test(dataProvider="registerData")
	public void registerUser(String gender, String firstName, String lastName, String email, String password, String confirmPassword) {
		
		RegisterPage rp = new RegisterPage(driver);
		rp.clickRegister();
		if(gender.contains("female")) {
			
			rp.enter_femaleGender();
		}
		else {
			rp.enter_maleGender();
		}
		rp.enter_firstName(firstName);
		rp.enter_lastName(lastName);
		rp.enter_email(email);
		rp.enter_password(password);
		rp.enter_confirmPassword(confirmPassword);
		rp.register_button();
		
	}
	
	@DataProvider(name="registerData")
	public Object[][] registerData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("Demo_Register");		
	}

}

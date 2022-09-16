package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.generic.UtilityMethods;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@class='ico-register']")
	WebElement registerLink;
	
	public void clickRegister() {
		
		clickAction(registerLink);		
	}
	
	@FindBy(id="gender-male")
	WebElement maleGender;
	
	@FindBy(id="gender-female")
	WebElement femaleGender;
	
	public void enter_maleGender() {
		clickAction(maleGender);
	}
	
	public void enter_femaleGender() {
		clickAction(femaleGender);
	}
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	public void enter_firstName(String value) {
		
		enterValue(firstName,value);
	}
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	public void enter_lastName(String value) {
		
		enterValue(lastName,value);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	public void enter_email(String value) {
		
		enterValue(email,value);
	}
	
	@FindBy(id="Password")
	WebElement password;
	
	public void enter_password(String value) {
		
		enterValue(password,value);
	}
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	public void enter_confirmPassword(String value) {
		
		enterValue(confirmPassword,value);
	}
	
	@FindBy(id="register-button")
	WebElement register_button;
	
	public void register_button() {
		
		clickAction(register_button);		
	}
}

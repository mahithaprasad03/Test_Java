package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.generic.UtilityMethods;

public class LoginPage extends UtilityMethods {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@class='ico-login']")
	WebElement loginLink;
	
	public void clickLogin() {
		
		clickAction(loginLink);		
	}
	
	@FindBy(id="Email")
	WebElement loginEmail;
	
	public void enter_loginEmail(String value) {
		
		enterValue(loginEmail,value);
	}
	
	@FindBy(id="Password")
	WebElement loginPassword;
	
	public void enter_loginPassword(String value) {
		
		enterValue(loginPassword,value);
	}
	
	@FindBy(xpath="//input[contains(@value,'Log')]")
	WebElement loginButton;
	
	public void enter_loginButton() {
		
		clickAction(loginButton);	
	}
	

}

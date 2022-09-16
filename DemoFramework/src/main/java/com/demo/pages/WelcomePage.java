package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.generic.UtilityMethods;

public class WelcomePage extends UtilityMethods {
	
	
  public WelcomePage(WebDriver driver) {
	  
	  PageFactory.initElements(driver,this);
  }
	
	@FindBy(id="small-searchterms")
	WebElement search;
	
	public void search_item(String value) {
		
	enterValue(search,value);

}
}

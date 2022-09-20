package com.demo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomePage extends BasePage {
	
	
  public WelcomePage(WebDriver driver) {
	  
	 super(driver);
  }
	
	@FindBy(id="small-searchterms")
	WebElement search;
	
	public void search_item(String value) {
		
	enterValue(search,value);
}
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	public
	WebElement computers;
	
	@FindBy(xpath="(//a[contains(text(),'Notebooks')])[1]")
	public
	WebElement notebooks;
	
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	public
	WebElement electronics;
	
	@FindBy(xpath="(//a[contains(text(),'Cell')])[1]")
	public
	WebElement cellPhones;
	
	@FindBy(xpath="//a[contains(text(),'Facebook')]/../..//a")
	public
	List<WebElement> links;
	
	public void clickLinks() throws InterruptedException {
		
		for(WebElement element:links) {
			
			if(!element.getText().equalsIgnoreCase("RSS")) {
			
				clickAction(element);
			}
		
			Thread.sleep(1000);
		}
	}
	
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	WebElement jewelry;
	
	public void clickJewelry() {
		
		clickAction(jewelry);
		
	}
	
}

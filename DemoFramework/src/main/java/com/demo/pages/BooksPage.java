package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{

	public BooksPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	WebElement books;
	
	public void clickBooks() {
		
		clickAction(books);
	}
	
	public WebElement getSortBy() {
		return sortBy;
	}

	public void setSortBy(WebElement sortBy) {
		this.sortBy = sortBy;
	}

	@FindBy(name="products-orderby")
	private
	WebElement sortBy;
	
	@FindBy(name="products-pagesize")
	WebElement disp;

	public WebElement getDisp() {
		return disp;
	}

	public void setDisp(WebElement disp) {
		this.disp = disp;
	}
	
	@FindBy(name="products-viewmode")
	public
	WebElement viewtype;	
	
}

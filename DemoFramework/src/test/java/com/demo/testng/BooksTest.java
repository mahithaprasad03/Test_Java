package com.demo.testng;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.generic.ExcelLibrary;
import com.demo.pages.BooksPage;

public class BooksTest extends BaseTest{
	
	@Test(dataProvider="dropdown", priority=0)
	public void booksDropdown(String sortBy,String display,String view) {	
		
		BooksPage bp = new BooksPage(driver);
		bp.clickBooks();
		Select sortByDrop = new Select(bp.getSortBy());
		sortByDrop.selectByVisibleText(sortBy);
//		Select displayDrop = new Select(bp.getDisp());
//		displayDrop.selectByIndex(display);	
		Select viewDrop = new Select(bp.viewtype);
		viewDrop.selectByVisibleText(view);	
		
	}
	
	
	@DataProvider(name="dropdown")
	public Object[][] dropdownValue() throws IOException {
		
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("Demo_Dropdown");	
	}

}

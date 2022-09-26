package Test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSiteDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='listbox'])[1]/..//a[contains(text(),'Books')]")).click();
		
		//sortby dropdown
		WebElement dropdown_sortBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select obj = new Select(dropdown_sortBy);
		obj.selectByVisibleText("Price: Low to High");
		
		//Display dropdown
		WebElement dropdown_Display =driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select obj1 = new Select(dropdown_Display);
		obj1.selectByVisibleText("12");
		
		//View as dropdown
		WebElement dropdown_Grid =driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select obj2 = new Select(dropdown_Grid);
		obj2.selectByVisibleText("List");
		driver.findElement(By.xpath("(//div[@class='listbox'])[1]/..//a[contains(text(),'Books')]")).click();
		
		// Prints WebElements	
		
		List<WebElement> dropdownlist=driver.findElements(By.xpath("//select[@id='products-orderby']"));
		
		for(WebElement a: dropdownlist) {
			
			System.out.println(a.getText());
		}
	}

}

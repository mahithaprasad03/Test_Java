package rahulshettytestwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fruit {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test(groups="unit")
	
	public void apple() {
		
		System.out.println("I am apple");
	}
	
	@Test
	
	public void mango() {
		
		System.out.println("I am mango");
	}
	
	@Test
	
	public void orange() {
		
		System.out.println("I am orange");
	}
	
	@AfterMethod
	
	public void end() {
		
		driver.close();
	}

}

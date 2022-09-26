package rahulshettytestwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Animal {

WebDriver driver;
	
	@BeforeMethod
	
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	
	public void tiger() {
		
		System.out.println("I am tiger");
	}
	
	@Test
	
	public void lion() {
		
		System.out.println("I am lion");
	}
	
	@Test(groups="unit")
	
	public void fox() {
		
		System.out.println("I am fox");
	}
	
	@AfterMethod
	
	public void end() {
		
		driver.close();
	}
}

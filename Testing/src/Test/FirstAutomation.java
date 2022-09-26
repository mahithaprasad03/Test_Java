package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {public FirstAutomation() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get("https://www.amazon.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();

	}

}

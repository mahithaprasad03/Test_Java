package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Core Java\\Selenium\\Select.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("s1"));
		Select obj = new Select (dropdown);
		obj.selectByValue("3");
		Thread.sleep(2000);
		obj.selectByVisibleText("java");
		Thread.sleep(2000);
		obj.deselectAll();
		Thread.sleep(2000);
	}

}

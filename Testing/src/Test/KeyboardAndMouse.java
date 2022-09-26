package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));		
		
		Actions action =new Actions(driver);
		
		action.moveToElement(element).sendKeys("selenium");
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
}

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='ico-register']"))));
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]"))));
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]"))));
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]")).click();
	}

}

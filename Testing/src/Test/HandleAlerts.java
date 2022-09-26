package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("mahi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		

	}

}

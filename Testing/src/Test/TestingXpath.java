package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		driver.findElement(By.xpath("//input[contains(@id,'weblog')]")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("mahi");
		driver.findElement(By.xpath("//input[contains(@id,'pass1')]")).sendKeys("GiantBig@6523");
		driver.findElement(By.xpath("//input[contains(@id,'admin')]")).sendKeys("mahi@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'blog_public')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'submit')]")).click();

	}

}

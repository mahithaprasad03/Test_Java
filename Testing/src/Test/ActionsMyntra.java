package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(men).build().perform();
		
		WebElement casualShirts = driver.findElement(By.xpath("(//a[@href='/men-casual-shirts'])"));
		
		act.moveToElement(casualShirts).click().perform();

		
	}

}

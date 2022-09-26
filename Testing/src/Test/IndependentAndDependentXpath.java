package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class IndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://demowebshop.tricentis.com");
//		driver.findElement(By.xpath("//a[.='Simple Computer']/../../..//input[@type='button']")).click();
//		driver.findElement(By.xpath("//a[.='Build your own computer']/../../..//input[@type='button']")).click();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//String currentHandle= driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("atomic habits");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[.='Atomic Habits: The life-changing million copy bestseller']")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t"); 
//		driver.switchTo().defaultContent();  
//		Thread.sleep(2000);  
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[.=' Atomic Habits: The life-changing million copy bestseller ']/../../../../.."
				+ "//div[@class='a-box-inner']//input[@id='add-to-cart-button']")).click();
		
	}

}

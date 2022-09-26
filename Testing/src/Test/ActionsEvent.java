package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEvent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement electronics = driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		
		Actions act = new Actions(driver);
		
	    act.moveToElement(electronics).build().perform();
	    
	    WebElement camera = driver.findElement(By.xpath("(//a[@href='/camera-photo'])[1]"));
	    
	    act.moveToElement(camera).click().perform();

	}

}

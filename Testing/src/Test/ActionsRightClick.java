package Test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.moveToElement(rightClick).contextClick().perform();
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//span[text()='Edit']/../..//span"));
		
		for(WebElement element : dropdown) {
			
			System.out.println(element.getText());
			act.moveToElement(rightClick).contextClick().perform();
			element.click();
			Thread.sleep(2000);
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
			
		}
		
		
		
		
		

	}

}

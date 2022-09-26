package Test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsToolsQA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Click me']"));
		
		for(WebElement button: buttons) {
			
			button.click();
			Thread.sleep(5000);
			Alert alt = driver.switchTo().alert();
			Thread.sleep(5000);
			String text = alt.getText();
			if(text.equalsIgnoreCase("Do you confirm action?")) {
				alt.dismiss();
			}
			
			else if(text.equalsIgnoreCase("Please enter your name")) {
				
				alt.sendKeys("mahitha");
				Thread.sleep(2000);
				alt.accept();
			}
			else {
			alt.accept();
			}
		}
		
//		WebElement button1 = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
//		WebElement button2 = driver.findElement(By.xpath("(//button[text()='Click me'])[2]"));
//		WebElement button3 = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
//		
//		button1.click();
//		Thread.sleep(5000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(5000);
//		System.out.println(alt.getText());
//		alt.accept();
//		
//		button2.click();
//		Thread.sleep(5000);
//		Alert alt2 = driver.switchTo().alert();
//		Thread.sleep(5000);
//		System.out.println(alt.getText());
//		alt.accept();
//		
//		button3.click();
//		Thread.sleep(5000);
//		Alert alt3 = driver.switchTo().alert();
//		Thread.sleep(5000);
//		System.out.println(alt.getText());
//		alt.dismiss();
	}

}

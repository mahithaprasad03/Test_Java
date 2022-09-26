package Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		//String parent = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		List<WebElement> tabs = driver.findElements(By.xpath("//a[text()='Facebook']/../..//a"));
		
//		Iterator<WebElement> list = tabs.iterator();
//		
//		while(list.hasNext()) {
//			
//			WebElement links = list.next();
//			System.out.println(links.getText());
//			links.click();
//		}
		
		//driver.findElement(By.xpath("//h3[text()='Follow us']/..//li[1]")).click();
	
		for(WebElement tab:tabs) {
			
			System.out.println(tab.getText());
			
			String value = tab.getText();
			
			if(!value.equalsIgnoreCase("RSS")){
				
				tab.click();
			}						
			
			Thread.sleep(2000);		
		}		
		
		Set<String> links = driver.getWindowHandles();
		
		for(String link: links) {
			
			driver.switchTo().window(link);
			
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}
}

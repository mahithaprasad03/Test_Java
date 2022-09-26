package Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		for(String a: childWindow) {
			
			driver.switchTo().window(a);
			
			//System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			
			if(driver.getTitle().contains("Twitter")){
				
				System.out.println(driver.getTitle());
			
			driver.close();	
			}
			
		}		
	}

}

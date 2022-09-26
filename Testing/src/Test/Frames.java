package Test;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		//driver.findElement(By.id("iFrame")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0,300)");
//	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	    int iframe = driver.findElements(By.tagName("iframe")).size();
//	    System.out.println(iframe);
//	    
//	    for(int i=0;i<iframe;i++) {
//	    	
//	    	driver.switchTo().frame(i);
//	    	int ele = driver.findElements(By.xpath("//span[text()='All']")).size();
//	    	System.out.println(ele);
//	    	driver.switchTo().defaultContent();
//	    	
//	    }
	    
	    try {
	    	driver.switchTo().frame("globalSqa");
	 	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 	     System.out.println("switched to frame");
	 	     WebElement dropdown = driver.findElement(By.xpath("//span[text()='All']"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).build().perform();
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		
	    }
	    
	    catch(Exception e) {
	    	System.out.println(e);
	    }	

	}

}

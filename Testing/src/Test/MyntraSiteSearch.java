package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSiteSearch {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("puma");
		
		Thread.sleep(2000);
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[contains(@class,'desktop-suggestion')]"));
		
		for(WebElement a: dropdown) {
			
			if(a.getText().contains("Puma Shoes"))
			{			
			    a.click();
			    Thread.sleep(10000);
			    System.exit(0);
			    
			}
			//System.out.println(a.getText());
		}
		
		//Thread.sleep(5000);
		
		//driver.get("https://www.myntra.com/puma-shoes?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-puma-shoes");
		
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("//img[contains(@title,'Men Navy Blue and White Colourblocked Sneakers')]")).click();

	}

}

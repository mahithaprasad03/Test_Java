package rahulshettytestwebsite;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//radio button
		driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
		
		//country selection
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
		
		Thread.sleep(1000);
		
		Actions actionCountry = new Actions(driver);		
	
		actionCountry.sendKeys(Keys.DOWN);
		
		actionCountry.sendKeys(Keys.DOWN).click().perform();		
		
		Thread.sleep(1000);
		
		//dropdown
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains (@id,'dropdown')]"));
		
		Select obj = new Select(dropdown);
		
		obj.selectByVisibleText("Option2");
		
		//checkbox
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

		//switch window
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String a:child) {
			
			driver.switchTo().window(a);
			
			if(driver.getTitle().contains("QA")) {
				
				System.out.println(driver.getTitle());   
				driver.close();
			}			
		}
		
		driver.switchTo().window(parent);
		
		//switch TAB
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		String parenttab = driver.getWindowHandle();
		
		Set<String> childtab = driver.getWindowHandles();
		
		for(String a:childtab) {
			
			driver.switchTo().window(a);
			
			if(driver.getTitle().contains("Rahul")) {
				
				System.out.println(driver.getTitle());   
				driver.close();
			}			
		}
		
		driver.switchTo().window(parenttab);
		
		//switch to alert
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mahi");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Alert alerts = driver.switchTo().alert();
		
		alerts.accept();
		
		//webtable price
		
		List<WebElement> priceList = driver.findElements(By.xpath("//td[text()='30']/../..//td[3]"));
		
		for(WebElement price: priceList) {
			
			System.out.println(price.getText());
			
		}
		
		//Hide 
		
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
		
		//show
		
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
		
		//scroll
		
		//WebElement webtable = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
		
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		
		execute.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);
		
		//Mouse Hover
		
		WebElement Mouseover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Mouseover).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[@href='#top']"))).click().perform();
		
		action.moveToElement(Mouseover).build().perform();
		
		Thread.sleep(1000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();
		
		//frame
		
		driver.switchTo().frame("courses-iframe");
		
		driver.findElement(By.xpath("(//a[@class='theme-btn'])[1]")).click();		

	}

}

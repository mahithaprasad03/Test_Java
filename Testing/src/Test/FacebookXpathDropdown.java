package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookXpathDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mahi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("prasad");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mahi@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Demo@123");
		WebElement dropdown_month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select obj=new Select(dropdown_month);
		obj.selectByVisibleText("Nov");
		WebElement dropdown_day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj1=new Select(dropdown_day);
		obj1.selectByVisibleText("3");
		WebElement dropdown_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj2=new Select(dropdown_year);
		obj2.selectByVisibleText("2020");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();		

	}

}

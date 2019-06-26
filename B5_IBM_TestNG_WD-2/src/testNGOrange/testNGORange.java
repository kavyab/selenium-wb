package testNGOrange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGORange {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void enterCredential() throws InterruptedException
	{
		WebElement uname=driver.findElement(By.cssSelector("#txtUsername"));
		WebElement pwd=driver.findElement(By.cssSelector("#txtPassword"));
		WebElement login=driver.findElement(By.cssSelector("#btnLogin"));
		uname.sendKeys("Admin");
		
			
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		pwd.sendKeys("admin123");
		
		login.click();
	}
	@Test
	public void displayMsg()
	{ 
		WebElement uname=driver.findElement(By.cssSelector("#txtUsername"));
		
	}
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	
}


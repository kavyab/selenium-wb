package com.selenium.testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeTestNG {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void enterCrendential()
	{
		
		WebElement uname=driver.findElement(By.cssSelector("#txtUsername"));
		WebElement pwd=driver.findElement(By.cssSelector("#txtPassword"));
		WebElement login=driver.findElement(By.cssSelector("#btnLogin"));
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		login.click();
		
	}
	
	
	
}
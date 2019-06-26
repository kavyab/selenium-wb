package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.testNGbasics.BrowserFactory;

public class OrangeHRM_login_logout {
	public static String baseUrl = "https://opensource-demo.orangehrmlive.com";
    public static WebDriver driver;
    
	@Parameters("browser")
    @BeforeTest
    public static void setup(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            driver = BrowserFactory.getBrowser("firefox");
        }
        else if(browser.equalsIgnoreCase("ie")) {
            driver = BrowserFactory.getBrowser("IE");
        }
        else if (browser.equalsIgnoreCase("chrome")) {        
            driver = BrowserFactory.getBrowser("chrome");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.testNGbasics.BrowserFactory;

public class GoogleSearch_CrossBrowser_Test {
	
	    public static String baseUrl = "https://www.google.com";
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
	    public void verifyHomePageTitle() {
	        String expectedTitle = "Google";
	        String actualTitle = driver.getTitle();
	        
	        Assert.assertEquals(actualTitle, expectedTitle);
	    }

	
	    @AfterTest
	    public void terminateBrowser() {
	        driver.close();
	        driver.quit();
	    }

}

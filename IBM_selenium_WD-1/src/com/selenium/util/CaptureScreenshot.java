package com.selenium.util;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

		public static void main(String[] args) throws Exception {
	        System.out.println("Capture_ScreenShot_Test...");
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	        WebElement we_Search = driver.findElement(By.name("q"));
	        we_Search.sendKeys("Selenium WebDriver");
	        
	        // Take screenshot and store as a file format
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String fileName = "C:\\Selenium_Automation\\Selenium_IDE\\IBM-Selenium_WD\\Selenium_WD_workspace\\IBM_selenium_WD-1\\screen_shots\\" + "googlsearch_"+System.currentTimeMillis()+".png";
	        FileUtils.copyFile(src, new File(fileName));
	    }


	}



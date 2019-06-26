package com.selenium.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	
		public static void main(String[] args) {
	        System.out.println("Mouse_Action_Test...");
	        
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        WebElement we_Search = driver.findElement(By.name("q"));
	        we_Search.sendKeys("Selenium WebDriver");
	        we_Search.sendKeys(Keys.ENTER);
	        
	        // scroll action...
	        Actions action = new Actions(driver);
	        WebElement we_Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	        action.moveToElement(we_Next).perform();
	        we_Next.click();
	    }
	}


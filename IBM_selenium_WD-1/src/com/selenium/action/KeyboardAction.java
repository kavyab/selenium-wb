package com.selenium.action;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	
		public static void main(String[] args) throws Exception {
	        System.out.println("Keyboard_Action_Test...");
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        WebElement we_Search = driver.findElement(By.name("q"));
	        
	        //Creating object of Actions class
	        Actions action = new Actions(driver);
	        

	        //Generating an action to type a text in CAPS
	        Action actionInCAPS1 = action.keyDown(we_Search, Keys.SHIFT)
	        		.sendKeys(we_Search, "Keyboard actions in Selenium")
	                .keyUp(we_Search, Keys.SHIFT)
	                .build();
	        Action actionInCAPS2 = action.keyDown(we_Search, Keys.SHIFT)
	                .sendKeys(we_Search, "Keyboard actions in Selenium")
	                .keyUp(we_Search, Keys.SHIFT)
	                .doubleClick().contextClick()
	                .build();
	        
	        actionInCAPS1.perform();
	        //actionInCAPS2.perform();
	        Thread.sleep(3000);
	        
	        we_Search.clear();
	        
	    } 


	}



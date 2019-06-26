package com.selenium.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class systemdatetest {

	
		public static void main(String[] args) throws Exception {
	        
	        System.out.println("System_Date_Test...");
	        Date now = new Date();
	        System.out.println(now);
	        
	        long starTime = System.currentTimeMillis();
	        // perform some operations...
	        for(int index=0; index < 5; index++) {
	            Thread.sleep(500);
	        }
	        long endTime = System.currentTimeMillis();
	        System.out.println("Time Taken:"+ (endTime-starTime));
	        
	        SimpleDateFormat dateFormat;
	        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        System.out.println(dateFormat.format(now)); 
	        
	        
	    		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	    		WebDriver driver=new ChromeDriver();
	    		driver.get("https://google.com");
	    		System.out.println (driver.findElement(By.tagName("title")).getText());

	    }
	    }
	



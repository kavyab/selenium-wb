package com.selenium.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	
		public static void main(String[] args) throws Exception {
	        System.out.println("Alert_Popup_Test...");
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/IBM_ADMIN/Documents/selenium_basic_ex/Alert.html");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("id_alert_me")).click();
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(2000);
	        
	       
	        System.out.println("Message:"+alert.getText());
	        alert.accept();
	        driver.findElement(By.id("id_confirm_me")).click();
	        Alert alert1=driver.switchTo().alert();
	        Thread.sleep(2000);
	        		alert1.dismiss();
	        		Thread.sleep(2000);
	        driver.findElement(By.id("id_prompt_me")).click();
	        Alert alert2=driver.switchTo().alert();
	        Thread.sleep(3000);
	        alert2.accept();
	        
	        
	   
	        

	
	}
	

	}



package com.selenium.log;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleesarch_log4j {

	
		 public static void main(String[] args) {
		        Logger log = Logger.getLogger(Googleesarch_log4j.class);
		        PropertyConfigurator.configure("config//log4j.properties");
		        //DOMConfigurator.configure("log4j.xml");

		
		        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		        WebDriver driver = BrowserFactory.getBrowser("firefox");

		        log.info("Chrome driver is instantiated...");

		       		
		
		        driver.get("https://www.google.com/");
		        log.info("LoginForm web page is opened...");
		        
		       log.debug("Page title"+driver.getTitle());
		       log.debug("Current URL"+driver.getCurrentUrl());
		
		        try {
		            WebElement we_Search = driver.findElement(By.name("q"));
		            we_Search.sendKeys("Log4j usage in selenium");
		            log.info("Search test field is located and value entered...");
		            we_Search.sendKeys(Keys.ENTER);
		            log.info("Search request is submitted...");

	
	 }catch (NoSuchElementException ex) {
        log.error("Unable to locate Web Element..." + ex.getMessage());            
    } catch (Exception ex) {
        log.error("General error occured while locating Web Element..." + ex.getMessage());
    }
    log.info("Log4j_Selenium_Test is completed...");
}

}


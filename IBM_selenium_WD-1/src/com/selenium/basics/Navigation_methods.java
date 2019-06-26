package com.selenium.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		Navigation navigate=driver.navigate();
		navigate.to("https://www.bing.com");
		Thread.sleep(2000);
		navigate.to(new URL("https://www.gmail.com"));
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		
		driver.close();
		
		
		
	
		

	}

}

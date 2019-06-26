package com.selenium.flighttour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.selenium.log.BrowserFactory;

public class tourmain_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.getBrowser("chrome");

		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login_page obj=new login_page(driver);
		obj.enterusername("go4nadeem@gmail.com");
		obj.enterpassword("selenium");	
		obj.clickOnLogin();
		
		welcome_page obj1=new welcome_page(driver);
		obj1.selecttrip();
		Thread.sleep(1000);
		obj1.SelectDepartFrom();
		Thread.sleep(1000);
		obj1.SelectArrivingIn();
		Thread.sleep(1000);
		obj1.usersubmit();
		
		
	}

}

package com.selenium.orangeHRM.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.selenium.log.BrowserFactory;

public class orangeHRM_maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=BrowserFactory.getBrowser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login_page obj1=new login_page(driver);
		obj1.enterusername("Admin");
		obj1.enterpassword("admin123");
		obj1.clickOnLogin();
		welcome_page obj2=new welcome_page(driver);
		obj2.welcome();
		obj2.welcomeclick();
		obj2.clickOnLogout();
	}

}

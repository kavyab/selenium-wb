package com.selenium.orangeHRM.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class welcome_page {
    WebDriver driver=null;
	private By we_welcome=By.linkText("Welcome Admin");
	private By logout=By.linkText("Logout");
	
	public welcome_page(WebDriver driver) {
		this.driver=driver;
	}

	public void welcome()
	{
		System.out.println(driver.findElement(we_welcome).getText());
		
	}
	
	public void welcomeclick()
	{   
		driver.findElement(we_welcome).click();
	}
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
	
}

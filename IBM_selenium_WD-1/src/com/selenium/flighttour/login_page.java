package com.selenium.flighttour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

	private WebDriver driver;
	private By uname=By.xpath("//input[@name='userName']");
	private By pword=By.xpath("//input[@name='password']");////input[@name='password'] 
	private By login=By.xpath("//input[@value='Login']");////input[@value='Login']


	
	public login_page(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enterusername(String uname_value)
	{
		
       driver.findElement(uname).sendKeys(uname_value);
     
	}
	
	public void enterpassword(String pword_value)
	{
		driver.findElement(pword).sendKeys(pword_value);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
	
	

}



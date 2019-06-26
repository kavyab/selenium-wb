package com.selenium.orangeHRM.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	private WebDriver driver=null;
	private By uname=By.xpath("//input[@name='txtUsername']");
	private By pword=By.xpath("//input[@name='txtPassword']");
	private By login=By.xpath("//input[@name='Submit']");
	
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

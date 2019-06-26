package com.selenium.testNGbasics;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test(priority=1)
	public void openBrowser()
	{
		System.out.println("openBrowser");
		
	}
	@Test(priority=2)
	public void openApp()
	{
		System.out.println("openApp");
		Assert.assertEquals(true,false);
	
	}
	@Test(priority=3,dependsOnMethods="openApp")
	public void performAction()
	{
		System.out.println("Login");
	}
	
	@Test(priority=4,enabled=false)
	public void closeApp()
	{
		System.out.println("close app");
	}
	
	@Test(priority=5)
	public void closeBrowser()
	{
		System.out.println("close Browser");
	}
	

}




package com.selenium.testNGbasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Priority_test {
	@Test(priority=1)
	public void openBrowser()
	{
		System.out.println("openBrowser");
		
	}
	@Test(priority=2)
	public void openApp()
	{
		System.out.println("openApp");
	
	}
	@Test(priority=3,enabled=false)
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

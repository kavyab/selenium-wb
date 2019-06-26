package com.selenium.testNGbasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AlwaysRun_Test {
	
	 @Test(priority = 1)
	    public void openBrowser() {
	        System.out.println("Open Browser...");
	    }
	    @Test(priority = 2)
	    public void openApp() {
	        System.out.println("Login gmail...");
	    }
	    @Test(priority = 3, dependsOnMethods = "openApp")
	    public void composeAction() {
	        System.out.println("Compose mail...");
	        
	    }

	
	    @Test(priority = 4, dependsOnMethods = "composeAction")
	    public void attachFileAction() {
	        System.out.println("Delete mail...");
	       assertEquals(false, true);
	    }
	    
	    //First time run without alwaysRun=true
	  //@Test(priority = 5, dependsOnMethods = "attachFileAction", alwaysRun=true)
	    
	   //@Test(priority = 5, dependsOnMethods = "attachFileAction")
	    @Test(priority = 5, dependsOnMethods = "attachFileAction", alwaysRun=true)
	    public void sendAction() {
	        System.out.println("Sending mail...");
	    }
	
	    @Test(priority = 6)
	    public void closeApp() {
	        System.out.println("Logout gmail...");
	    }
	    @Test(priority = 7)
	    public void closeBrowser() {
	        System.out.println("Close Browser...");
	    }

}

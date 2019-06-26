package com.selenium.testNGbasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Timeout {
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


    
    @Test(priority = 4, dependsOnMethods = "composeAction", timeOut=5000)
    public void attachFileAction() {
        System.out.println("Attach File...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    @Test(priority = 6)
    public void closeApp() {
        System.out.println("Logout gmail...");
    }
    @Test(priority = 7)
    public void closeBrowser() {
        System.out.println("Close Browser...");
    }
}

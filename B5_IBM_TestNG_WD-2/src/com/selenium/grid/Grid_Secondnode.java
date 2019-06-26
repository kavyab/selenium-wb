package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid_Secondnode {
	WebDriver driver;
    String baseURL, nodeURL;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        baseURL = "https://www.google.com/";
        nodeURL = "https://192.168.29.179:4444/wd/hub";


        // Define desired capabilities
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        //cap.setBrowserName("chrome");
        //cap.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL(nodeURL), cap);
    }


    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }

    @Test
    public void googleTest() {
        driver.get(baseURL);
        
        if (driver.getPageSource().contains("Google")) {
            Assert.assertTrue(true, "Google Testing Link Found");
        } else {
            Assert.assertTrue(false, "Failed: Link not found");
        }
    }
}




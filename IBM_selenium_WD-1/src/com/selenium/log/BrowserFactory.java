package com.selenium.log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

			 public static WebDriver getBrowser(String browserType) {
		        if(browserType.equals("firefox")) {
		            System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
		            return new FirefoxDriver();
		        }
		        if(browserType.equals("chrome")) {
		            System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		            return new ChromeDriver();
		        }

	
		        if(browserType.equals("IE")) {
		            System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
		            return new InternetExplorerDriver();
		        }
		        if(browserType.equals("safari")) {
		            return new SafariDriver();
		        }

		
		        else {
		            System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
		            return new FirefoxDriver();
		        }
		    }


	}



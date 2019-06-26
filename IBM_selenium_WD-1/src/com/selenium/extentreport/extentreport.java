package com.selenium.extentreport;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.log.BrowserFactory;

public class extentreport {

	
		public static void main(String[] args) {
	        ExtentTest test;
	        ExtentReports report;
	        report = new ExtentReports("C:\\Selenium_Automation\\Selenium_IDE\\IBM-Selenium_WD\\Selenium_WD_workspace\\IBM_selenium_WD-1\\report\\Extent_Report_Test.html");
	        test = report.startTest("Extent_Report_Test");

	
	        WebDriver driver = BrowserFactory.getBrowser("chrome");
	        driver.get("https://www.google.com/");

	
	        if (driver.getTitle().equals("Googles")) {
	            test.log(LogStatus.PASS, "Navigated to the specified URL");
	        } else {
	            test.log(LogStatus.FAIL, "Test Failed...");
	        }

	        report.endTest(test);
	        report.flush();
	    }


	}



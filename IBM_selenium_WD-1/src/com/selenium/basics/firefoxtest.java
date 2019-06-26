package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtest {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			String acttitle=driver.getTitle();
			String exptitle="Google";
			if(acttitle.equals(exptitle))
			{
				System.out.println("Testcase passed");
				
			}
				
			driver.close();

		}

	}

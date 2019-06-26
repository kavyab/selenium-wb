package com.selenium.basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEtest {


	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
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



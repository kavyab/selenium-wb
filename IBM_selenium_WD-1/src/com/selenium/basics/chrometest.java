package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrometest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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

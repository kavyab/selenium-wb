package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pgsource=driver.getPageSource();
		String title=driver.getTitle();
		
		System.out.println("Page source is "+pgsource);
		System.out.println("Title is "+title);
		driver.close();
		driver.quit();
	}

}

package com.selenium.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			System.out.println (driver.findElement(By.tagName("title")).getText());
			driver.close();

	}

}

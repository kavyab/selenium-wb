			package com.selenium.basics;
			
			import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
			
			public class WebElement_commands {
			
				public static void main(String[] args) {
					
					System.out.println("webelement commands");
					System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("http://www.google.com");
					WebElement element=driver.findElement(By.xpath("//input[@title='Search']"));
					element.sendKeys("bing.com");
					element.sendKeys(Keys.ENTER);
					
					
					driver.close();
			
				}
			
			}

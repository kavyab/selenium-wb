package com.selenium.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframesaction {


		public static void main(String[] args) throws Exception {
	        System.out.println("Handling_Frame_Dragging_Test...");
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://jqueryui.com/draggable/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Method#2 - locate the frame element and switchTo
	        WebElement we_Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(we_Frame);
	        
	        
	        WebElement we_draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
	        System.out.println(we_draggable.getText()); 
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(we_draggable).dragAndDropBy(we_draggable, 50, 50).build().perform();
	        
	        //action.moveToElement(we_draggable).dragAndDropBy(we_draggable, 50, 50).build().perform();
	        
	        }
	}



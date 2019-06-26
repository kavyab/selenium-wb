package com.selenium.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class iframedroppable {

		public static void main(String[] args) throws Exception {
	        System.out.println("Handling_Frame_Dragging_Test...");
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Method#2 - locate the frame element and switchTo
	        WebElement we_Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(we_Frame);
	        
	        WebElement we_draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
	        System.out.println(we_draggable.getText()); 
	        
	        
	        WebElement we_droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
	        System.out.println("Before dropping"+we_droppable.getText()); 
	        
	        Actions action = new Actions(driver);
	        //action.moveToElement(we_draggable).dragAndDropBy(we_draggable, 50, 50).build().perform();
	        action.moveToElement(we_draggable).dragAndDrop(we_draggable, we_droppable).build().perform();
	        WebElement after_dropped=driver.findElement(By.id("droppable"));
	        System.out.println("After dropping"+ after_dropped.getText());
	        
	        //action.moveToElement(we_draggable).dragAndDropBy(we_draggable, 50, 50).build().perform();
	        
	        }
	




	}



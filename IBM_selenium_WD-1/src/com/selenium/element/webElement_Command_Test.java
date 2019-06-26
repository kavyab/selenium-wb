package com.selenium.element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_Command_Test {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("WebElement_Command_Test...");
        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\IBM_ADMIN\\Documents\\selenium_basic_ex/ex1.html");
        // Locating WebElement -> By.id
        WebElement we_loginname = driver.findElement(By.id("id_loginname"));
        System.out.println(we_loginname.isDisplayed());
        WebElement we_password = driver.findElement(By.id("id_password"));
        we_password.isDisplayed();
        System.out.println(we_password.isDisplayed());

        // Locating WebElement -> By.name
        //WebElement we_loginname = driver.findElement(By.name("loginname"));
        //WebElement we_password = driver.findElement(By.name("password"));
        
        // Enter login name and password
        we_loginname.sendKeys("Selenium");
        
        we_password.sendKeys("WebDriver");


        Thread.sleep(2000);
        
        // Clear login name and passwod
        we_loginname.clear();
        we_password.clear();


        Thread.sleep(2000);
        
        // Locating WebElement and entering values in one step
        driver.findElement(By.id("id_loginname")).sendKeys("*Selenium*");
        driver.findElement(By.id("id_password")).sendKeys("*WebDriver*");


        // <input type="text" id="id_loginname" name="loginname" >
        // getAttribute("attribute-name")
        System.out.println("type:"+we_loginname.getAttribute("type"));
        System.out.println("id:"+we_loginname.getAttribute("id"));
        System.out.println("name:"+we_loginname.getAttribute("name"));

        // print the values which we have entered...
        // Note: We cannot extract text from the textfield or any editable item using getText()
        System.out.println("Text:loginname="+we_loginname.getText());
        System.out.println("Text:loginname="+we_loginname.getAttribute("value"));

        WebElement we_Register = driver.findElement(By.linkText("Click Here"));
        System.out.println(we_Register.isSelected());
        System.out.println("Text:Register="+we_Register.getText());// will work 
        System.out.println("Text:Register="+we_Register.getAttribute("value"));  
        
        
        WebElement subbtn=driver.findElement(By.id("btn_submit"));
        if(subbtn.isDisplayed())
        	System.out.println("Displayed");
        Point point=subbtn.getLocation();
        System.out.println("X coordinate is "+point.getX()+"\t"+"Y Coordinate is "+point.getY());
        
        Dimension dim=subbtn.getSize();
        
        System.out.println("height is "+dim.getHeight()+"\t"+"width is"+dim.getWidth());
        
        
        if(subbtn.isEnabled())
        {subbtn.click();
        System.out.println("submitted");
        }
        
        
       
}
	}



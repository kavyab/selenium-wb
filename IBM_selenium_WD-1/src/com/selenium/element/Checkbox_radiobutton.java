package com.selenium.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_radiobutton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\IBM_ADMIN\\Documents\\selenium_basic_ex/Register.html");
		
		List<WebElement> we_Sex_List=driver.findElements(By.name("sex"));
		 System.out.println("Radio Button-Sex:"+we_Sex_List.size());
	        System.out.println("Printing ALL values...");
	        for(WebElement we:we_Sex_List) {
	            System.out.println(we.getAttribute("value"));
	        }
	        
	        WebElement we_Sex_Male = driver.findElement(By.id("id_male"));
	        WebElement we_Sex_Female = driver.findElement(By.id("id_female"));
	        we_Sex_Male.click();
	        
	        System.out.println("Sex-Male:"+we_Sex_Male.isSelected());
	        System.out.println("Sex-FeMale:"+we_Sex_Female.isSelected());
	        
	        List<WebElement> chkbox=driver.findElements(By.name("profession"));
	        for(WebElement wc:chkbox)
	        {
	        	System.out.println("Values are"+wc.getAttribute("value"));
	        	
	        }
	        WebElement matester=driver.findElement(By.id("id_manualtester"));
	        WebElement atester=driver.findElement(By.id("id_automationtester"));
	        
	        matester.click();
	        //System.out.println("displayes:"+matester.isDisplayed());//matester.isDisplayed();
	        
	        atester.click();
	        if((atester.isSelected())&&(matester.isSelected()))
	        {
	        	System.out.println("Both the checkboxes are selected");
	       
	        }
	        else if(atester.isSelected())
	        	System.out.println("atester is selected");
	        else if(matester.isSelected())
	        	System.out.println("matester is selected");
	        else
	        	System.out.println("Both are not selected");
	        

		
	}

}

package com.selenium.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	
		public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/IBM_ADMIN/Documents/selenium_basic_ex/Register.html");
	        WebElement weColumn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]"));
	        String xPath_absolute = "/html/body/form/table/tbody/tr[2]/td[2]"; // Free
	        String xPath_relative = "//table/tbody/tr[2]/td[2]"; // Free
	        //WebElement we_column = driver.findElement(By.xpath(xPath_absolute));
	        WebElement we_column = driver.findElement(By.xpath(xPath_relative));
	        
	        System.out.println("xPath_absolute: " + we_column.getText());
	        we_column = driver.findElement(By.xpath(xPath_relative));
	        System.out.println("xPath_relative: " + we_column.getText());

	
	        String xPath_table_header = "//table/tbody/tr[1]";
	        List<WebElement> we_table_header_list = driver.findElements(By.xpath(xPath_table_header));
	        System.out.println("Printing Header...");
	        for (WebElement we_header : we_table_header_list) {
	            System.out.println(we_header.getText());
	        }
	        // Row Count in WebTable
	        
	        WebElement table = driver.findElement(By.xpath("//table"));
	        List<WebElement> row = table.findElements(By.tagName("tr"));
	        System.out.println("Total Number of Rows = " + row.size());
	        // Column Count in WebTable
	        List<WebElement> column = table.findElements(By.tagName("td"));        //row.get(1).findElements(By.tagName("td"));
	        System.out.println("Total Number of Column = " + column.size());
	        // Print content of Rows
	        for (int i = 0; i <= row.size() - 1; i++) {
	           //System.out.println(row.get(i).getText());
                     if(column.get(i).getText().equals("Selenium"))
	            	System.out.println(column.get(i).getText());
	            
	        }
	    
	    }
	}



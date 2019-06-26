package com.selenium.testexcercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OrangeHRM_Property_Excel_Log_Test {

		public static void main(String[] args) {
	        
	        // ***** Readig Property File for URL and Locators...
	        String baseUrl,xpathuserName,xpathpassword,xpathLogin, username, password, login, login_username, login_password, welcome, logout;
	        baseUrl = username = password = login = login_username = login_password = welcome = logout = xpathLogin= xpathpassword =xpathuserName=null;
	        try (FileInputStream fileInput = new FileInputStream(new File("resources//OrangeHRM.properties"))) {
	            Properties properties = new Properties();
	            properties.load(fileInput);
	            properties.list(System.out);

	            baseUrl = properties.getProperty("baseURL");
	            username = properties.getProperty("xpathuserName");
	            password = properties.getProperty("xpathpassword");
	            login = properties.getProperty("xpathLogin");
	            login_username = properties.getProperty("userName");
	            login_password = properties.getProperty("password");
	            welcome = properties.getProperty("xpathWelcome");
	            logout = properties.getProperty("xpathLogOut");

	
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        // **** Reading Excel File for Test Data
	// **** To BE DONE 
	        File file = new File( "resources\\OrangeHRM.xls");
	        System.out.println(file);
	        
	        Workbook workbook = null;
	        try {
	            workbook = Workbook.getWorkbook(file);
	            Sheet sheet = workbook.getSheet(0);
	                        //sheet.getCell(col, row)
	            Cell cell1 = sheet.getCell(0, 0);            // baseUrl
	            System.out.print(cell1.getContents() + ":"); 
	            Cell cell2 = sheet.getCell(0, 1);            // https://www.google.com/
	            System.out.println(cell2.getContents()); 


	            Cell cell3 = sheet.getCell(1, 0);            // Browser
	            System.out.print(cell3.getContents() + ":"); 
	            Cell cell4 = sheet.getCell(1, 1);            // chrome
	            System.out.println(cell4.getContents()); 
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (BiffException e) {
	            e.printStackTrace();
	        } finally {
	            if (workbook != null) {
	                workbook.close();
	            }
	        
	    
	    





	
	        // **** Configuring Logger using Property File...
	        Logger log = Logger.getLogger(OrangeHRM_Property_Excel_Log_Test.class);
	        PropertyConfigurator.configure("config//log4j.properties");
	        // *** Executing Test script...
	        WebDriver driver = BrowserFactory.getBrowser("chrome");

	
	        log.info("Chrome driver is instantiated...");
	        
	        driver.get(baseUrl);
	        log.info(baseUrl + " is opened...");
	        log.debug("Current URL:"+driver.getCurrentUrl());
	        log.debug("Page Title:"+driver.getTitle());

	
	// Screenshot...Page_Open
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	        WebElement we_Username = driver.findElement(By.xpath(username));
	        WebElement we_Password = driver.findElement(By.xpath(password));
	        WebElement we_Login = driver.findElement(By.xpath(login));
	        log.info("WebElements are found...");
	        log.debug(we_Username + ":" + we_Password + ":" +we_Login);
	        we_Username.sendKeys(login_username);
	        we_Password.sendKeys(login_password);
	// Screenshot...UsernamePassword_Entered
	        
	        log.info("Username and password entered...");
	        log.debug("Username:"+login_username + "\t" + "Password:"+login_password);
	        we_Login.click();
	        log.info("Login is clicked...");

	
	// Screenshot...Welcome_Result
	        
	        // retrieve Welcome message
	        WebElement we_WelcomeMessage = driver.findElement(By.xpath(welcome));
	        System.out.println(we_WelcomeMessage.getText());
	        log.info("Welcome window opened...");
	        log.debug("Welcome:"+we_WelcomeMessage.getText());

	
	        // click on Logout
	        we_WelcomeMessage.click();
	        log.info("Welcome is clicked...");
	        log.info("Clicking logout...");
	        driver.findElement(By.xpath(logout)).click();
	        log.info("logged out...");
	        
	    }
	


	}
}

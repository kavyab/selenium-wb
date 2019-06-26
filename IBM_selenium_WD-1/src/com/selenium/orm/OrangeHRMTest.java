package com.selenium.orm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.log.BrowserFactory;
import com.selenium.log.loggerfile;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OrangeHRMTest {
	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String dateValue = new SimpleDateFormat("yyyy_MMM_dd_hh_mm_ss").format(new Date());
        String screenShot1 = "Screen_Shot//" + name + "_" + dateValue + ".png";
	
        FileUtils.copyFile(source, new File(screenShot1));
        
	}
	
		public static void main(String[] args) throws IOException {
	        System.out.println("Read from Property File..OrangeLogin_Logout...");
	        Logger log=Logger.getLogger(OrangeHRMTest.class);
			PropertyConfigurator.configure("config//log4j.properties");
	        String browser, url, usernamelocator, passwordlocator, loginlocator, username, password, welcomelocator,
	                logoutlocator,login;
	        
	        browser = url = usernamelocator = passwordlocator = loginlocator = username = password = welcomelocator = login=logoutlocator = null;
	        WebDriver driver=BrowserFactory.getBrowser("chrome");
	        try(FileInputStream inputStream= new FileInputStream(new File("resources\\orangeHRM.properties"))) {
	            Properties prop = new Properties();
	            prop.load(inputStream);
	            browser = prop.getProperty("browser");
	            url = prop.getProperty("baseURL");
	            log.info("URL Launched");
	            
	            usernamelocator = prop.getProperty("xpathuserName");
	            passwordlocator = prop.getProperty("xpathpassword");

	
	            loginlocator = prop.getProperty("xpathLogin");
	            //username = prop.getProperty("userName");
	            
	            //password = prop.getProperty("password");
	            log.info("Username&Password entered");
	            welcomelocator = prop.getProperty("xpathWelcome");
	            logoutlocator = prop.getProperty("xpathLogOut");
	            prop.list(System.out);
	        } catch (Exception e) 
	        {
	        	log.debug("Unable to locate the webElement");
	        }

	        File file = new File( "resources\\OrangeHRM.xls");
	        System.out.println(file);
	        
	        Workbook workbook = null;
	        Cell cell1,cell2,cell3,cell4;
	        cell1=cell2=cell3=cell4=null;
	        try {
	            workbook = Workbook.getWorkbook(file);
	            Sheet sheet = workbook.getSheet(0);
	                        //sheet.getCell(col, row)
	             cell1 = sheet.getCell(0, 0);            // baseUrl
	            System.out.print(cell1.getContents() + ":"); 
	            cell2 = sheet.getCell(0, 1);            // https://www.google.com/
	           System.out.println(cell2.getContents()); 


	            cell3 = sheet.getCell(1, 0);            // Browser
	            System.out.println(cell3.getContents() + ":"); 
	            cell4 = sheet.getCell(1, 1);            // chrome
	            System.out.println(cell4.getContents() + ":"); 
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (BiffException e) {
	            e.printStackTrace();
	        } finally {
	            if (workbook != null) {
	                workbook.close();
	            }
	        
	        //if (browser.equalsIgnoreCase("Chrome")) {
	           // System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	           // driver = new ChromeDriver();
	        //}
	        //else if (browser.equalsIgnoreCase("firefox")) {
	         //   System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
	         //   driver = new FirefoxDriver();
	        //}

	
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get(url);
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String fileName = "C:\\Selenium_Automation\\Selenium_IDE\\IBM-Selenium_WD\\Selenium_WD_workspace\\IBM_selenium_WD-1\\screen_shots\\" + "OrangeHRM"+System.currentTimeMillis()+".png";
	        FileUtils.copyFile(src, new File(fileName));
	        
			driver.findElement(By.xpath(usernamelocator)).sendKeys(cell2.getContents());
	        
			driver.findElement(By.xpath(passwordlocator)).sendKeys(cell4.getContents());
	        src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        fileName = "C:\\Selenium_Automation\\Selenium_IDE\\IBM-Selenium_WD\\Selenium_WD_workspace\\IBM_selenium_WD-1\\screen_shots\\" + "OrangeHRM"+System.currentTimeMillis()+".png";
	        FileUtils.copyFile(src, new File(fileName));
	        driver.findElement(By.xpath(loginlocator)).click();

	
	        // Welcome message
	        WebElement welLocator = driver.findElement(By.linkText(welcomelocator));
	        String welcomeMessage = welLocator.getText();
	        src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        fileName = "C:\\Selenium_Automation\\Selenium_IDE\\IBM-Selenium_WD\\Selenium_WD_workspace\\IBM_selenium_WD-1\\screen_shots\\" + "OrangeHRM"+System.currentTimeMillis()+".png";
	        FileUtils.copyFile(src, new File(fileName));
	        System.out.println("Welcome Message is: " + welcomeMessage);
	        log.info("You are Welcome to this Page");
	        welLocator.click();
	        // Logout
	        driver.findElement(By.linkText(logoutlocator)).click();

	
	        //To close/quit the browser
	        driver.close();
	        driver.quit();
	    }


	}
}



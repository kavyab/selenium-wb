package com.selenium.orm;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selenium.log.BrowserFactory;



	public class OrangeHRM_Login_logout_Test {

			public static void main(String[] args) {
		        System.out.println("Read from Property File..OrangeLogin_Logout...");
		        String browser, url, usernamelocator, passwordlocator, loginlocator, username, password, welcomelocator,
		                logoutlocator;
		        browser = url = usernamelocator = passwordlocator = loginlocator = username = password = welcomelocator = logoutlocator = null;
		        WebDriver driver=BrowserFactory.getBrowser("chrome");
		        try(FileInputStream inputStream= new FileInputStream(new File("resources\\orangeHRM.properties"))) {
		            Properties prop = new Properties();
		            prop.load(inputStream);
		            browser = prop.getProperty("browser");
		            url = prop.getProperty("baseURL");
		            usernamelocator = prop.getProperty("xpathuserName");
		            passwordlocator = prop.getProperty("xpathpassword");

		
		            loginlocator = prop.getProperty("xpathLogin");
		            username = prop.getProperty("userName");
		            password = prop.getProperty("password");
		            welcomelocator = prop.getProperty("xpathWelcomeMessage");
		            logoutlocator = prop.getProperty("xpathLogOut");
		            prop.list(System.out);
		        } catch (Exception e) {
		            e.printStackTrace();
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
		        driver.findElement(By.xpath(usernamelocator)).sendKeys(username);
		        driver.findElement(By.xpath(passwordlocator)).sendKeys(password);
		        driver.findElement(By.xpath(loginlocator)).click();

		
		        // Welcome message
		        WebElement welLocator = driver.findElement(By.linkText(welcomelocator));
		        String welcomeMessage = welLocator.getText();
		        System.out.println("Welcome Message is: " + welcomeMessage);
		        welLocator.click();
		        // Logout
		        driver.findElement(By.linkText(logoutlocator)).click();

		
		        //To close/quit the browser
		        driver.close();
		        driver.quit();
		    }
	}
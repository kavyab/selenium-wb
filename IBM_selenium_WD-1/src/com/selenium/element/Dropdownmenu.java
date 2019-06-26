package com.selenium.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\IBM_ADMIN\\Documents\\selenium_basic_ex/Register.html");
		
		Select selectContinents = new Select(driver.findElement(By.id("continents")));
		//System.out.println(selectContinents);
        // print all the values of dropdown
        List<WebElement> we_continents_list = selectContinents.getOptions();
        for(WebElement we:we_continents_list) {
            System.out.println(we.getAttribute("value")+":"+we.getText());
        }
        selectContinents.selectByVisibleText("Australia");
        
        
        Thread.sleep(3000);
        
        selectContinents.selectByIndex(0);

        /*Select selectContinents = new Select(driver.findElement(By.id("continents")));
        // print all the values of dropdown
        List<WebElement> we_continents_list = selectContinents.getOptions();
        for(WebElement we:we_continents_list) {
            System.out.println(we.getAttribute("value")+":"+we.getText());
        }
        selectContinents.selectByVisibleText("Australia");
        
        Thread.sleep(3000);
       
        selectContinents.selectByIndex(0);*/

// Perform multi-select operations...
        Select selectSeleniumProjects = new Select(driver.findElement(By.id("id_seleniumprojects")));
        if (selectSeleniumProjects.isMultiple()) {
            selectSeleniumProjects.selectByIndex(0);        //    Selenium IDE    
            selectSeleniumProjects.selectByValue("wd");        //    wd
            selectSeleniumProjects.selectByVisibleText("Selenium Grid");    //    Selenium Grid
        }
        System.out.println("Printing ALL Multi-Select Dropdown values...");
        List<WebElement> we_selected_seleniumproject_list = selectSeleniumProjects.getAllSelectedOptions();
        for (WebElement we_selenium_project:we_selected_seleniumproject_list) {
            System.out.println(we_selenium_project.getText());
        }
	}

}

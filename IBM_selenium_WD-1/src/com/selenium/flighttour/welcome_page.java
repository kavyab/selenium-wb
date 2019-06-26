package com.selenium.flighttour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class welcome_page {

	private WebDriver driver;
	public welcome_page(WebDriver driver)
	{
		this.driver=driver;

	}
	public void selecttrip()
	{
		WebElement radio_but=driver.findElement(By.xpath("//input[@value='oneway']"));
		radio_but.click();
	}

	public void SelectDepartFrom()
	{

		Select depfrom=new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> depfrom_option=depfrom.getOptions();
		for(WebElement i:depfrom_option)
			System.out.println(i.getText());
		depfrom.selectByVisibleText("London");

	}
	public void SelectArrivingIn()
	{
		Select arrivin=new Select(driver.findElement(By.name("toPort")));
		List <WebElement> arrivin_option=arrivin.getOptions();
		for(WebElement i:arrivin_option)
			System.out.println(i.getText());
		arrivin.selectByVisibleText("Paris");
	}	

	public void usersubmit()
	{
		WebElement conte=driver.findElement(By.xpath("//input[@name='findFlights']"));
		conte.submit();

}

}

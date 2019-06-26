package com.selenium.testexcercise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void takeScreenShot(WebDriver driver, String name) throws IOException 
	{
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String dateValue = new SimpleDateFormat("yyyy_MMM_dd_hh_mm_ss").format(new Date());
        String screenShot1 = "Screen_Shot//" + name + "_" + dateValue + ".png";
	
        FileUtils.copyFile(source, new File(screenShot1));
        
	}
	

}

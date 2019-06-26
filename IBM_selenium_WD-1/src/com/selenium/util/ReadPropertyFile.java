package com.selenium.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadPropertyFile {

	public static void main(String[] args) {
		 
		        File file;
		        FileInputStream fileInput;
		        Properties properties;
		        
		        // creating a file object
		        file = new File("resources//application.properties");
		        try {
		            // creating a file input stream for reading
		            fileInput = new FileInputStream(file);

				            // creating a properties object to hold values from file
		            properties =  new Properties();
		            
		            // creating a properties class to load file details...
		            properties.load(fileInput);
		            
		            // dumping the property values...
		            properties.list(System.out);

		
		            String baseUrl = properties.getProperty("baseUrl");
		            String browser = properties.getProperty("browser");
		            String searchText = properties.getProperty("searchText");
		            String searchPath = properties.getProperty("searchPath");
		            
		            System.out.println(baseUrl);
		            System.out.println(browser);
		            System.out.println(searchText);
		            System.out.println(searchPath);

		
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }


	}


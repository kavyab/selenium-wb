package com.selenium.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class loggerfile {

	public static void main(String[] args) {
		//To initialise one Logger object
		Logger log=Logger.getLogger(loggerfile.class);
		PropertyConfigurator.configure("config//log4j.properties");
		DOMConfigurator.configure("config//log4j.xml");//required for XML
		
		//Where they will get printed
		log.debug("1-debug message");
		log.info("2-info message");
		log.warn("3-warn message");
		log.fatal("4-fatal message");
		log.error("5-error message");
		System.out.println("done");
		//debug<<info<<warn<<fatal<<error
		//based on this above level, log will be created
		
		
	}

}

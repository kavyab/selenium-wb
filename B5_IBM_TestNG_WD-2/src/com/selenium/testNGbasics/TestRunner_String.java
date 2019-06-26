package com.selenium.testNGbasics;

import com.beust.testng.TestNG;

public class TestRunner_String {

	public static void main(String[] args) {
		
	        TestNG testSuite = new TestNG();
	        testSuite.setTestClasses(new Class[] { StringOperationTest.class });
	        //testSuite.addListener(new TestNG_SuiteListener());
	        testSuite.setDefaultSuiteName("TestNG Suite");
	        testSuite.setDefaultTestName("StringTest");
	        testSuite.setOutputDirectory("testng-String-output");
	        testSuite.run();
	    }
	}


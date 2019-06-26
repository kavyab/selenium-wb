package com.selenium.testNGbasics;

import com.beust.testng.TestNG;

public class TestNGRunner {
	
	    // Running TestNG test cases using TestNG class as java application.
	    public static void main(String[] args) {
	        TestNG testSuite = new TestNG();
	        testSuite.setTestClasses(new Class[] { CalculatorTest.class });
	        //testSuite.addListener(new TestNG_SuiteListener());
	        testSuite.setDefaultSuiteName("TestNG Suite");
	        testSuite.setDefaultTestName("CalculatorTest");
	        testSuite.setOutputDirectory("testng-output");
	        testSuite.run();
	    }
	}

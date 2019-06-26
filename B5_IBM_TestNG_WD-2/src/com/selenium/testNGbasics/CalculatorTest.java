package com.selenium.testNGbasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {

	 @Test
	    public void testAdd() {
	        //System.out.println("testAdd...");
	        int actualResult = calculator.add(10, 20);
	        int expectedResult = 30;
	        /*if(expectedResult == actualResult) {
	            System.out.println("PASS: testAdd...");
	        }
	        else {
	            System.out.println("FAIL: testAdd...");
	        }*/

//
	        assertEquals(actualResult, expectedResult);
	    }
      @Test
      public void testsub()
      {
    	  int actualResult = calculator.sub(10, 20);
      int expectedResult = 10;
      /*if(expectedResult == actualResult) {
          System.out.println("PASS: testAdd...");
      }
      else {
          System.out.println("FAIL: testAdd...");
      }*/
      assertEquals(actualResult, expectedResult);
  }
      @Test
      public void testmul()
      {
    	  int actualResult = calculator.mul(10, 20);
      int expectedResult = 200;
      /*if(expectedResult == actualResult) {
          System.out.println("PASS: testAdd...");
      }
      else {
          System.out.println("FAIL: testAdd...");
      }*/
      assertEquals(actualResult, expectedResult);
  }
      @Test
      public void testdiv()
      {
    	  int actualResult = calculator.div(10, 20);
      int expectedResult = 200;
      
      assertEquals(actualResult, expectedResult);
  }
	}


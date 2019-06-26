package com.selenium.testNGbasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StringOperationTest {
	StringOperation obj;
	
	@BeforeMethod
	public void createobj()
	{
		obj=new StringOperation();
	}

	@AfterMethod
	public void delobj()
	{
		obj=null;
	}
	@Test
	public void testlen()
	{
	 
	int actval=obj.findLenght("Kavya");
	System.out.println(actval);
	int expecval=5;
    assertEquals(expecval,actval);
	}
	@Test
	public void testrev()
	{
		boolean rev=obj.checkPalindrome("Kavya");
		System.out.println("Palindrome ?"+rev);
		String expval="ayvak";
		assertEquals(expval,rev);
		
	}
}

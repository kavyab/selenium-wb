package com.junit.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_LifeCycle_Test {

	@Before
	public void beforeclass()
	{
		System.out.println("before class");
		
	}
	@BeforeClass
	public static void beforemethod()
	{
		System.out.println("before method");
		
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
		
	}
	@After
	public static void test2()
	{
		System.out.println("test2");
		
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class");
		
	}
	@After
	public void aftertest()
	{
		System.out.println("after test");
		
	}
	
	}



package com.junit.basic

public class Junit_LifeCycle_TestNG {
	
	
	@Before
	public void beforeclass()
	{
		System.out.println("before class");
		
	}
	@BeforeClass
	public void beforemethod()
	{
		System.out.println("before method");
		
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
		
	}
	@AfterTest
	public void test2()
	{
		System.out.println("test2");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
		
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
		
	}
}
 class
after test
PASSED: test1
PASSED: test2*/

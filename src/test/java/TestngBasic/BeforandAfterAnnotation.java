package TestngBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforandAfterAnnotation 
{

	@BeforeSuite 
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest (enabled = false)
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeClass (enabled = false)
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod  (enabled = false)
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	//.....................................................//
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	
	@Test
	public void sum()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	@Test
	public void print()
	{
		System.out.println("Print");
	}
	
	
	
	
	
	
}

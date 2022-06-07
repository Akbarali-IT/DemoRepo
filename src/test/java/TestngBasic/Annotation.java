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

public class Annotation 
{

	@Test
	public void Firstmethod()
	{
		System.out.println("This is First method");
	}
	
	@Test
	public void Secondmethod()
	{
		System.out.println("This is Second method");
	}
	
	//Before Annotation
	
//	@BeforeSuite
//	public void firstmethod()
//	{
//		int a = 10+20;
//		int sum = a;
//		System.out.println("Method call befor ClassA suite: "+ a);	
//	}
//	
//	
//	@BeforeTest
//	public void SecondMethod()
//	{
//		System.out.println("Method call before ClassA Test");
//	}
//	
//	@BeforeClass
//	public void ThirdMethod()
//	{
//		System.out.println("Method call befor ClassA class");
//	}
//	
//	@BeforeMethod
//	public void ForthMethod()
//	{
//		System.out.println("Method call befor ClassA method");
//	}
	
	
//	//After Annotation
	
	
    @AfterMethod
	public void M1()
	{
		System.out.println("AfterMethod");
	}
	
    @AfterClass
    public void M2()
	{
		System.out.println("AfterClass");
	}
    
    @AfterTest
	public void M3()
	{
		System.out.println("AfterTest");
	}
    
    @AfterSuite
    public void M4()
	{
		System.out.println("AfterSuite");
	}
    
    
    
    
    
    
}

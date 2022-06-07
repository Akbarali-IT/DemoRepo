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

public class ClassB {

	@Test
    public void MethodB()
	{
		System.out.println("This is Method B");

	}
	
	@Test
	public static void demo()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		System.out.println("Sum is "+sum);
	}

//	@BeforeSuite
//	public void BeforeClassB()
//	{
//		System.out.println("Method call befor ClassB suite");
//
//	}
//	
//	@BeforeTest
//	public void BeforMethodInforClassB()
//	{
//		System.out.println("Method call befor ClassB Test");
//
//	}
//	
//	@BeforeClass
//	public void BeforTestInforClassB()
//	{
//		System.out.println("Method call befor ClassB Class");
//
//	}
//	
//	@BeforeMethod
//	public void BeforSuiteInforClassB()
//	{
//		System.out.println("Method call befor ClassB Method");
//
//	}
	
	@AfterMethod
	public void AfterClassB()
	{
		System.out.println("Method call After ClassB method");

	}
	
	@AfterClass
	public void AfterClassc()
	{
		System.out.println("Method call After Classc Class");

	}
	
	@AfterTest
	public void AfterClassd()
	{
		System.out.println("Method call After Classd Test");

	}
	
	@AfterSuite
	public void AfterClassE()
	{
		System.out.println("Method call After ClassE suite");

	}
	
	
	
	
}

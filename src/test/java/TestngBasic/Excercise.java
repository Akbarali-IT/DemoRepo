package TestngBasic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Excercise 
{

	
//	@Test
//	public void Addition()
//	{
//		System.out.println("This is Method Addition");
//	}
//	
//	
//	@Test 
//	public void Multiplication()
//	{
//		System.out.println("This is Method Multiplication");
//	}
//	
	
	@Parameters({"name"})
	@Test
	public void Substraction(String name)
	{
		System.out.println(name);
	}
	
	
//	@Test 
//	public void Division()
//	{
//		System.out.println("This is Method Division");
//	}
//	
}

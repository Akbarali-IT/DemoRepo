package TestngBasic;

import org.testng.annotations.Test;

public class TestngBasic 
{

	@Test (priority =1, dependsOnMethods = "method3")
	public void methodone()
	{
		System.out.println("Method 1");
	}
	
	
	@Test (priority =2, enabled = false)
	public void method2()
	{
		System.out.println("Method 2");
	}
	
	
	@Test (priority =3)
	public void method3()
	{
		System.out.println("Method 3");
	}
	
	 
	@Test (priority =4)
	public void method4()
	{
		System.out.println("Method 4");
	}
}

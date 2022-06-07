package TestngBasic;

import org.testng.annotations.Test;

public class Invocation 
{

	
	
	@Test(invocationCount = 5)
	public void empdetail()
	{
		System.out.println("This is invocationv test");
	}
	
	@Test(invocationCount = 10)
	public void compnydetail()
	{
		System.out.println("This is simple test");
	}
	
}

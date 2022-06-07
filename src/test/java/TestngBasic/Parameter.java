package TestngBasic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter 

{
    
	@Parameters({"name", "age"})
	@Test(enabled = false)
	public void parametertest(String name, String age)
	{
		System.out.println("Value of A is "+ name);
		System.out.println("Value of B is "+ age);
		//System.out.println("Sum is: "+ (A+B));
		
	}
	
	@Parameters({"num1", "num2"})
	@Test
	public void sum(int num1, int num2)
	{
		System.out.println("num1 is "+ num1);
		System.out.println("num2 is "+ num2);
		System.out.println("sum is "+ (num1+num2));
	}
	
	
}

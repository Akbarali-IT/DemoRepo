package TestngBasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionn 
{
	@Test
	public void verification()
	{
		int a = 20;
		int b = 20;
		int sum = a+b;
		
		SoftAssert softAssertion= new SoftAssert();
		
		softAssertion.assertEquals(sum, 41, "Sum is not matching");
		softAssertion.assertTrue(sum==40, "Sum is not true");
		
		System.out.println("This is verification");
	}
	
	
	
	
	
}

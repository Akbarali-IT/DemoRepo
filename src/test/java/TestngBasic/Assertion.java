package TestngBasic;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
    
	@Test(enabled = false)
	public void softcheck() 
	{
		 int a = 10;
		 int b = 20;
		 int sum = a+b;
		 
		 Assert.assertEquals(sum, 30, "sum is 30");
		 System.out.println("This is hard Assertion");
       
	     Assert.assertTrue(sum==29);
		System.out.println("This is soft Assertion");
	}
	
	
	@Test
	public void hardcheck()
	{
		 int a = 10;
		 int b = 20;
		 int sum = a+b;
		 
		 SoftAssert obj = new SoftAssert();
		 
		 obj.assertEquals(sum, 30, "sum is 30");
		 System.out.println("This is soft Assertion");
       
		 obj.assertTrue(sum==30);
		 System.out.println("This is soft Assertion");
		
		 obj.assertAll();
	}
	
	
}

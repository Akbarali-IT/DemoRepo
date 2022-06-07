package Testcases;

import org.testng.annotations.Test;

public class Priority 
{

	
	@Test(enabled=false)
	public void multwonumber()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Mul is: "+ sum);
	}
	
	
	
	@Test(enabled=false)
	public void sumtwonumber()
	{
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println("sum is: "+ z);
		
	}
	
	@Test(enabled=true)
	public void factorialmethod()
	{
		int fact = 1;
		int num=3;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of 5 is: "+fact);
		
	}
	
	@Test
	public void star()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int a=5; a>=1; a--)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

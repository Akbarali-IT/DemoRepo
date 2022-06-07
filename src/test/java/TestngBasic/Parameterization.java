package TestngBasic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{

	@Parameters({"empname","empage"})
	@Test
	public void parameterize(String empname, int empage)
	{
		System.out.println("Employee name: "+empname);
		System.out.println("Employee Age: "+ empage);
	}
	
	
	
}

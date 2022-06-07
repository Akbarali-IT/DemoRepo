package TestngBasic;

import org.testng.annotations.Test;

public class GroupingConcept 

{
    @Test (priority = 1, groups = "RunMethod")
	public void Methodone()
	{
		System.out.println("This is method one");
		
	}
	
    @Test
	public void Methodtwo()
	{
		System.out.println("This is method two");
		
	}
	
    @Test
	public void Methodthree()
	{
		System.out.println("This is method three");
		
	}
	
    @Test (priority = 2, groups = "RunMethod")
	public void Methodfour()
	{
		System.out.println("This is method four");
		
	}
	
}

package TestngBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvder 
{

	@Test (dataProvider = "Getdata")
	public void Empdetail(String name)
	{
	
	System.out.println("Name is: "+ name);
		
	}
	
	@DataProvider(name = "Getdata")
	public Object getdata() 
	{
		
		Object[] name = new Object[1];
		
		name[0]= "Jack";
		
		return name;
		
	}
	
	
	
}

package Testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import recoursedata.BaseClass;



public class LoginTest extends BaseClass
{

	//public WebDriver driver;
	public LoginPage login;
	JavascriptExecutor jsexecutor;
	Actions Act;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver = initialization();
		driver.get(pop.getProperty("datadesignurl"));
		jsexecutor = (JavascriptExecutor)driver;
		//Act = new Actions(driver);		
	}
	
	
	@Test
	public void login() throws IOException, InterruptedException
	{		
		login = new LoginPage(driver);
		login.username().sendKeys(pop.getProperty("username"));
		login.password().sendKeys(pop.getProperty("password"));
		Thread.sleep(2);
		jsexecutor.executeScript("arguments[0].click()",login.submit());				
		
		
	}
	
	//@AfterTest
    public void downtear()
    {
    	
	 driver.quit();
	
    }
    
    
   
     
		
		
		
}
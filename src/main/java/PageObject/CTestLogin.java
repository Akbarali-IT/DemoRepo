package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import recoursedata.BaseClass;

public class CTestLogin extends BaseClass 
{
public WebDriver driver;
	
	

	By Emailaddress = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("(//div[contains(text(),'Login')])[1]");
	By validation = By.xpath("//div[contains(text(),'Something went wrong...')]");
	
	
	public WebElement Emailaddress()
	{
		return driver.findElement(Emailaddress);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public WebElement validation()
	{
		return driver.findElement(validation);
	}
	
	
	public CTestLogin CCLogin() throws InterruptedException
	{
		CTestLogin obj = new CTestLogin();
		driver.get(pop.getProperty("cogmentourl"));
		//coglogin = new CogmentoLoginObject(driver);
		obj.Emailaddress().sendKeys(pop.getProperty("email"));
		Thread.sleep(2);
		obj.password().sendKeys(pop.getProperty("password"));
		obj.login().click();
		String vmessage = obj.validation().getText();
		
		return obj;
		
	}
	
	
	
	
}

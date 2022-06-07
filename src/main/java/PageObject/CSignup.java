package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSignup 
{
	
	public WebDriver driver;
	
	public CSignup(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By signup = By.linkText("Sign Up");
	By emailaddress = By.xpath("//input[@name='email']");
	By phone = By.xpath("//input[@name='phone']");
	By terms = By.cssSelector("#terms");
	By submit = By.xpath("//button[@type='submit']");
	
	
	
	public WebElement signup()
	{
		return driver.findElement(signup);
	}
	
	
	public WebElement emailaddress()
	{
		return driver.findElement(emailaddress);
	}
	
	public WebElement phone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement terms()
	{
		return driver.findElement(terms);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}

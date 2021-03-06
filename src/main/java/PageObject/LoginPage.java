package PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By username = By.id("userName");
	By password = By.id("password");
	By submit = By.xpath("//button[@type='submit']");
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryy 

{
	
	public WebDriver driver;
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public PageFactoryy(WebDriver driver2)
	{
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getusername()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement submit()
	{
		return submit;
	}

}

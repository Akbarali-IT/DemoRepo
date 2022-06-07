package Practice.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen 

{
	//public WebDriver driver;
	
	@Test
	public void openBrowser()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		
	    driver.get("practice.automationtesting.in/");
		
	}
	
	

}

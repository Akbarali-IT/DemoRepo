package recoursedata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
   
	public static WebDriver driver;
	public  Properties pop;
	
	
	public WebDriver initialization() throws IOException
	{
		pop = new Properties();
		FileInputStream FI = new FileInputStream("/Users/akbarali.nagalpara/eclipse-workspace/FrameworkBasic/src/main/java/recoursedata/data.properties");
		pop.load(FI);
		
		
		String browser = pop.getProperty("browser");
		
		switch(browser)
		{
		   case("chrome"):		   
		   WebDriverManager.chromedriver().create();
		  
		   case("firefox"):		   
		   WebDriverManager.firefoxdriver().create();
		  
		   
		   default:
		   WebDriverManager.chromedriver().create();			   		
		}
		
		//pop.getProperty("practiceurl");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
}

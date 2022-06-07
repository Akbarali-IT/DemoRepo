package recoursedata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends BaseClass
{

	
	public static WebElement explictlyWait(WebDriver driver, By path)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50, 1));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(path));
	}
	
	
	
	
}

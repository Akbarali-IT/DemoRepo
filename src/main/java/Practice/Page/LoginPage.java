package Practice.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import recoursedata.BaseClass;
import recoursedata.TestUtil;

public class LoginPage extends BaseClass
{

	By shop = By.xpath("//a[contains(text(),'Shop')]");
	By home = By.xpath("//a[contains(text(),'Home')]");
	By firstslide = By.xpath("//img[@alt='Shop Selenium Books']");
	By secondslide = By.xpath("(//img[@alt='HTML'])");
	By thirdslide = By.xpath("(//img[@alt='JavaScript'])");
	By rightarrow = By.xpath("(//img[@alt='Arrow'])[2]");
	By filterbutton = By.xpath("//button[contains(text(),'Filter')]");
	
	
	public boolean clickOnShopMenu()
	{
		TestUtil.explictlyWait(driver, shop);
	    driver.findElement(shop).click();
	    TestUtil.explictlyWait(driver, filterbutton);
	    boolean filercheck = driver.findElement(filterbutton).isDisplayed();
		
	    return filercheck;
	}
	
	public boolean clickOnHome()
	{
      TestUtil.explictlyWait(driver, home);
	  driver.findElement(home).click();
	  TestUtil.explictlyWait(driver, firstslide);
	  boolean homecheck = driver.findElement(firstslide).isDisplayed();
	  
	  return homecheck;
	}
	
	
	public boolean verifyFirstSlideImage()
	{
		TestUtil.explictlyWait(driver, firstslide);
		boolean firstSlid = driver.findElement(firstslide).isDisplayed();
		return firstSlid;
		
	}
	
	public boolean verifySecondSlideImage()
	{
		driver.findElement(rightarrow).click();
		TestUtil.explictlyWait(driver, secondslide);
		boolean secondSlid=driver.findElement(secondslide).isDisplayed();
		return secondSlid;
		
	}
	
	public boolean verifyThirdSlideImage()
	{
		driver.findElement(rightarrow).click();
		
		TestUtil.explictlyWait(driver, thirdslide);
		boolean thirdSlid =driver.findElement(thirdslide).isDisplayed();
		return thirdSlid;
		
	}	
	}
	
	

	


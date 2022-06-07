package Testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.CSignup;
import PageObject.CogmentoLoginObject;
import recoursedata.BaseClass;



public class CogmentoLogin extends BaseClass
{

	public WebDriver driver;
	public CogmentoLoginObject coglogin;
	public CSignup csing;
	
	//public SoftAssert softasseret;
	
	
	@Test
	public void Clogin() throws IOException, InterruptedException
	{
		driver = initialization();
		
//		driver.get(pop.getProperty("cogmentourl"));
//		coglogin = new CogmentoLoginObject(driver);
//		coglogin.Emailaddress().sendKeys(pop.getProperty("email"));
//		Thread.sleep(2);
//		coglogin.password().sendKeys(pop.getProperty("password"));
//		coglogin.login().click();
//		String vmessage = coglogin.validation().getText();
//		
//		Assert.assertEquals(vmessage, pop.getProperty("validationmessage"), "Validation message does not match");
		
		//............SingUP.......................//
		
		csing = new CSignup(driver);
		csing.signup().click();
		csing.emailaddress().sendKeys(pop.getProperty("signupemail"));
		csing.phone().sendKeys(pop.getProperty("phone"));
		csing.terms().click();
		csing.signup().click();
		
		
		
		
		
		
		
		
		
		
	}

//	@AfterTest
//     public void teardown()
//     {
//    	 driver.close();
//     }
	
	
	
	}



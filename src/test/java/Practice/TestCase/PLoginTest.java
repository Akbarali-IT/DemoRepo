package Practice.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Practice.Page.LoginPage;
import recoursedata.BaseClass;

public class PLoginTest extends BaseClass
{

	LoginPage plogin;
	
	@Test(priority=0)
	public void initiliseBrowser() throws IOException
	{
		driver = initialization();
		plogin = new LoginPage();
		driver.get(pop.getProperty("practiceurl"));
		
	}
	
	@Test(priority=1)
	public void validateShopTest()
	{
		boolean shopcheck = plogin.clickOnShopMenu();
		Assert.assertTrue(shopcheck);
	}
	
	@Test(priority=2)
	public void validateHomeTest()
	{
		boolean homecheck = plogin.clickOnHome();
		Assert.assertTrue(homecheck);
	}
	
	@Test(priority=3)
	public void validateFirstSliderTest()
	{
		boolean firstslidercheck = plogin.verifyFirstSlideImage();
		Assert.assertTrue(firstslidercheck);
	}
	
	
	@Test(priority=4)
	public void validatesecondSliderTest()
	{
		boolean secondslidercheck = plogin.verifySecondSlideImage();
		Assert.assertTrue(secondslidercheck);
	}
	
	@Test(priority=5)
	public void validatethirdSliderTest()
	{
		boolean thirdslidercheck = plogin.verifyFirstSlideImage();
		Assert.assertTrue(thirdslidercheck);
	}
	
	
	
	
	
	
	
}

package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class Validation extends Base {
	
	public static Logger log=LogManager.getLogger(Validation.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		driver=initializeDriver();
		
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		
		log.info("Navigated to home page");
		
		System.out.println(System.getProperty("user.dir"));
	}
	
	@Test
	public void homePageNavigation() throws IOException {
		
		LandingPage landdingPage=new LandingPage(driver);
		
		Assert.assertEquals(landdingPage.featuredCourses.getText(), "FEATUREDCOURSES");
		
		log.info("successfully validated text");
		
		Assert.assertTrue(landdingPage.navigationbar.isDisplayed());
		
			}
	
	
	  @AfterTest 
	  public void closeBrowserAfterTestCompletion() {
	  
	  driver.close(); 
	  }
	 


}

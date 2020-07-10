package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class WindowAuthenticationTesting extends Base {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		driver=initializeDriver();
		
		
	}
	
	@Test
	public void windowAuth(){

		driver.get(prop.getProperty("url"));
		
	}
	
	/*
	 * @AfterTest public void closeBrowserAfterTestCompletion() {
	 * 
	 * driver.close(); }
	 */ 

}

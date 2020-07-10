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

public class HomePage extends Base {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		driver=initializeDriver();
		
		
	}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String username,String password,String text) throws IOException {

		driver.get(prop.getProperty("url"));
		
		LandingPage landdingPage=new LandingPage(driver);
		
		landdingPage.login.click();
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.emailAddress.sendKeys(username);
		
		loginPage.emailPassword.sendKeys(password);
		
		System.out.println(text);
		
		loginPage.logon.click();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//Row count is how many test data to run
		//Column count is how many value you are sending for one test to run
		
		Object[][] data=new Object[2][3];
		
		//first set of data
		
		data[0][0]="nonresitricteduser@gmail.com";
		data[0][1]=	"123";
		data[0][2]="Non restricted user";
		
		//second set of data
		
		data[1][0]="resitricteduser@gmail.com";
		data[1][1]=	"123";
		data[1][2]="Restricted user";
		
		return data;
		
		
	}
	
	
	  @AfterTest public void closeBrowserAfterTestCompletion() {
	  
	  driver.close(); }
	 

}

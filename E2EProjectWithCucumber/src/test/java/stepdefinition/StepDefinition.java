package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefinition extends Base {

	@Given("Initialize browser with chrome")
	public void initialize_browser_with_chrome() throws IOException {

		driver=initializeDriver();
		
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
		
		driver.get(string);
	}

	@Given("Click on login link on the home page to land in secure login page")
	public void click_on_login_link_on_the_home_page_to_land_in_secure_login_page() {

		LandingPage landdingPage=new LandingPage(driver);
		
		landdingPage.login.click();
	}

	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String string, String string2) {
	
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.emailAddress.sendKeys(string);
		
		loginPage.emailPassword.sendKeys(string2);
		
		loginPage.logon.click();
		
		
	}

	@Then("Verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
	    
		System.out.println("Successfully logged in");
		
	}

	
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	  WebDriver driver;
	  
	  public LandingPage(WebDriver driver) {
	  
	  this.driver=driver;
	  
	  PageFactory.initElements(driver, this);
	  
	  }
	 
	
	
		
		  @FindBy(xpath="//span[contains(text(),'Login')]") 
		  
		  public WebElement login;
		  
		  
		  @FindBy(xpath="//h2[text()='Featured Courses']") 
		  
		  public WebElement featuredCourses;
		  
		
		  @FindBy(xpath="//nav[@class='navbar-collapse collapse']") 
		  
		  public WebElement navigationbar;
		 
	  
		/*
		 * By login= By.xpath("//span[contains(text(),'Login')]");
		 * 
		 * public WebElement login() {
		 * 
		 * return driver.findElement(login); }
		 */
}

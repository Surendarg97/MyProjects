package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	  WebDriver driver;
	  
	  public LoginPage(WebDriver driver) {
	  
	  this.driver=driver;
	  
	  PageFactory.initElements(driver, this);
	  
	  }
	 
		  @FindBy(name="user[email]") 
		  
		  public WebElement emailAddress;
		  
		  @FindBy(id="user_password") 
		  
		  public WebElement emailPassword;
		  
		  @FindBy(xpath="//input[@type='submit']") 
		  
		  public WebElement logon;
		  
		
		 
	 
		
}

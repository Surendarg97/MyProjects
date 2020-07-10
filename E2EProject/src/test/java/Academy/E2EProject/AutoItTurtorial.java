package Academy.E2EProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class AutoItTurtorial extends Base {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		driver=initializeDriver();
		
		
	}
	
	@Test
	public void windowAuth() throws InterruptedException, IOException{

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\surendarg97\\Desktop\\Autoit\\autoit.exe");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#processTask")));
		
		
		  driver.findElement(By.cssSelector("button#processTask")).click();
		 
	//	Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("a#pickfiles")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#pickfiles")));
		
		driver.findElement(By.cssSelector("a#pickfiles")).click();
		
		File path=new File("C:\\Users\\surendarg97\\Downloads\\ilovepdf_pages-to-jpg.zip");
		
		if(path.exists())
		{
			System.out.println("File found");
			
			path.delete();
		}
		}
		
	
	
	/*
	 * @AfterTest public void closeBrowserAfterTestCompletion() {
	 * 
	 * driver.close(); }
	 */ 

}

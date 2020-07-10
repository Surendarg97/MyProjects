package seleniumLearningFromUdemy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CDCMyConnect {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		/*
		 * driver.get("chrome://settings/clearBrowserData");
		 * 
		 * driver.findElement(By.id("clearBrowsingDataConfirm")).click();
		 */
		
		driver.get("https://cdc-myconnect.wipro.com/");
		
		Thread.sleep(2000);
		
		Robot rb =new Robot();
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(15000);
		
	
		
		//need to write code for popup alert
		
			WebDriverWait wait= new WebDriverWait(driver, 20);
		
           wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id ='Enter user name']")))).click();

			driver.findElement(By.xpath("//input[@id ='Enter user name']")).sendKeys("gs20018729");
		  
		  driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("May@2020");
		  
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		  
		  Thread.sleep(15000);
		  
		  //otp enter
		  
		  //driver.findElement(By.cssSelector("input[id='response']"));
		  
		  driver.findElement(By.cssSelector("input[type='SUBMIT']")).click();
		  
		  driver.findElement(By.linkText("Detect Receiver")).click();
		  
		  
		  
		  Thread.sleep(5000);
		  
		  //need to write code for alert popup
		  
		  	rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);

		 // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("legalstatement-checkbox"))));

		  driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		  
		  driver.findElement(By.id("protocolhandler-detect-alreadyInstalledLink")).click();
		  
		  Thread.sleep(10000);
		  
		  driver.findElement(By.id("desktopsBtn")).click();
		  
		  driver.findElement(By.linkText("Details")).click();
		  
		  driver.findElement(By.id("appInfoOpenBtn")).click();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
			}

}

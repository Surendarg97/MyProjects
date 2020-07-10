package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWiproTimeSheet {
	
	    private static String whatToExecute= "efforts";
	 
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://mywipro.wipro.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gs20018729@wipro.com");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys("May@2020");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("signInAnotherWay")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Call +XX XXXXXXXX85‎']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".fav_icon.appIcon-myTime")))).click();
		
		//driver.findElement(By.xpath("(//*[@class='fav_main'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://wscloudapp2.wipro.com/myTime']")));
		
		Thread.sleep(5000);
		
		if("efforts"==whatToExecute) {
			
		
		driver.findElement(By.linkText("EFFORTS")).click();
		
		}else {
		
	    driver.findElement(By.xpath("(//a[@title='Attendance'])[1]")).click();
		  
	    Thread.sleep(5000);
		  
	    driver.findElement(By.linkText("OOD")).click();
		}
		 
		
		
			}

}

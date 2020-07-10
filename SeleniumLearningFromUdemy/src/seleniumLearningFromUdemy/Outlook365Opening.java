package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook365Opening {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Outlook 365");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("loginfmt")).sendKeys("gs20018729@wipro.com");
		
		driver.findElement(By.name("loginfmt")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("passwd")).sendKeys("May@2020");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("passwd")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("signInAnotherWay")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Call +XX XXXXXXXX85‎']")).click();
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//div[@title='Outlook']")).click();
		
		
		

		//driver.quit();
	}

}

package seleniumLearningFromUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Hello");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("wgs");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("wgs");
		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		//driver.quit();
		
		String errorMessageText = driver.findElement(By.cssSelector("#error")).getText();
		
		System.out.println(errorMessageText);
		

	}
	

}

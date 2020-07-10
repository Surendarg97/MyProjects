package seleniumLearningFromUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("surendarg97@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("6796g8530");
		
		driver.findElement(By.id("loginbutton")).click();
		
		/*
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 * 
		 * driver.quit();
		 */		
		

	}

}

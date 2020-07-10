package seleniumLearningFromUdemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {

		
		int sum=0;
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		String url="https://ksrtc.in/oprs-web/";
		
		driver.get(url);
		
		String goingFrom="Benga";
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(goingFrom);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script="return document.getElementById(\"fromPlaceName\").value;";
		
		String text=(String) js.executeScript(script);
		
		System.out.println(text);
		
		
		while(!(text.equalsIgnoreCase("CHIKKALSANDRA BENGALURU"))) {
		
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			
			text=(String) js.executeScript(script);
			
			System.out.println(text);
			
		}
		
		
		
	}

}

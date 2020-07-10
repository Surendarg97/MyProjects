package seleniumLearningFromUdemy;

import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * SECONDS) .pollingEvery(5, SECONDS) .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 */
		
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
	}

}

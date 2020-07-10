package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExercise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("#name")).sendKeys("Surendar");

		driver.findElement(By.id("alertbtn")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#name")).sendKeys("Surendar");

		driver.findElement(By.id("alertbtn")).click();

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#name")).sendKeys("Surendar");

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
	}

}

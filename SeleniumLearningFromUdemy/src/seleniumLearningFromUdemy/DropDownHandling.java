package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement currencyDropdown = driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));

		Select selectObject = new Select(currencyDropdown);

		selectObject.selectByValue("USD");

		Thread.sleep(1000);

		selectObject.selectByIndex(2);

		Thread.sleep(1000);

		selectObject.selectByVisibleText("INR");

		driver.findElement(By.id("divpaxinfo")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int adults = 1;

		while (adults < 4) {

			driver.findElement(By.cssSelector("#hrefIncAdt")).click();

			adults++;

		}

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		Thread.sleep(1000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.quit();

	}

}

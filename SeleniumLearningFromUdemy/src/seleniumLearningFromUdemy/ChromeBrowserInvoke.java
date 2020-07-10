package seleniumLearningFromUdemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		/*
		 * driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		 */

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.get("http://www.yahoo.com/");

		driver.navigate().back();

		driver.navigate().forward();

		//driver.quit();

	}

}

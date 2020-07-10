package seleniumLearningFromUdemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windowAsSetOfStrings = driver.getWindowHandles();
		
		Iterator<String> iterator = windowAsSetOfStrings.iterator();
		
		String parentWindow = iterator.next();
		
		String childWindow = iterator.next();
		
		System.out.println(driver.switchTo().window(childWindow).getTitle());
		
		driver.close();
	}

}

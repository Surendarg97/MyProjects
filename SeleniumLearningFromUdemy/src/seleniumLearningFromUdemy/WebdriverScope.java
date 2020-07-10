package seleniumLearningFromUdemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverScope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			
			String controlEnter=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(controlEnter);
			
			Thread.sleep(5000);
			
		}
		
		Set<String> totalWindows = driver.getWindowHandles();
		
		Iterator<String> iterator = totalWindows.iterator();
		
		while(iterator.hasNext()) {
			
			driver.switchTo().window(iterator.next());
			
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
	}

}

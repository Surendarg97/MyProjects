package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(frame);
		
		/*
		 * driver.findElement(By.xpath("//div[@id='draggable']/p")).click();
		 * 
		 * System.out.println("Element got clicked");
		 */
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions object= new Actions(driver);
		
		object.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Accordion")).click();
		
		
		
		
	}

}

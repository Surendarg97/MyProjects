package seleniumLearningFromUdemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) throws InterruptedException {

		String[] itemsNeedsToBeInCart = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, 5);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		
		Set<String> windowAsSetOfStrings = driver.getWindowHandles();
		
		Iterator<String> iterator = windowAsSetOfStrings.iterator();
		
		String parentWindow = iterator.next();
		
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		//Actions mouseAction= new Actions(driver);
		
		//mouseAction.doubleClick(driver.findElement(By.xpath("//tr/th[2]")));
		
		driver.findElement(By.xpath("//tr/th[2]")).click(); 
		
		List<WebElement> vegorfruitsWebelemnet= driver.findElements(By.xpath("//tr/td[2]"));
		
		ArrayList<String> originalList= new ArrayList<String>();
		
		for(int i=0;i<vegorfruitsWebelemnet.size();i++ ) {
			
			System.out.println(vegorfruitsWebelemnet.get(i).getText());
			
			originalList.add(vegorfruitsWebelemnet.get(i).getText());
		}

		ArrayList<String> copiedlList= new ArrayList<String>();
		
		copiedlList.addAll(originalList);
		
		System.out.println(copiedlList.toString());
		
		Collections.sort(copiedlList);
		
		Collections.reverse(copiedlList);
		
		System.out.println(copiedlList.toString());
		
		//driver.findElement(By.xpath("//tr/th[2]")).click();
		
	
	//Assert.assertTrue(copiedlList.equals(originalList));
		
		
		
		
	}

}

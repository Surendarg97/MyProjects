package seleniumLearningFromUdemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='picker-second']/input)[1]")).isEnabled());
		
		String style = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");
		
		if(style.contains("0.5")) {
			
			System.out.println("It is disabled");
		}else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.xpath("(//div[@class='picker-second']/input)[1]")).click();
		
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='picker-second']/input)[1]")).isEnabled());
		
		
		
		
		
		
		
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		WebElement currencyDropdown = driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
		
		Select selectObject= new Select(currencyDropdown);
		
		selectObject.selectByValue("USD");
		
		Thread.sleep(1000);
		
		selectObject.selectByIndex(2);
		
		Thread.sleep(1000);
		
		selectObject.selectByVisibleText("INR");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		int adults=1;
		
		while(adults<4 ) {
		
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		
		adults++;
		
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		Thread.sleep(1000);
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"));
		
		
		
		
		
	}

}

package seleniumLearningFromUdemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderExercise {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		WebElement calenderMonths = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
		while(!(calenderMonths.getText().contains("June"))) {
		
		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		
		}
		
		List<WebElement> calenderDays = driver.findElements(By.className("day"));
		
		System.out.println(calenderDays.size());
		
		for(int i=0;i<calenderDays.size();i++) {
		
			
		if(calenderDays.get(i).getText().contains("26")) {
			
			calenderDays.get(i).click();
			
		}
		}
	}

}

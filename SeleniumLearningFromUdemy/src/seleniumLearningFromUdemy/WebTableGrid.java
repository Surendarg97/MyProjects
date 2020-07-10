package seleniumLearningFromUdemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableGrid {

	public static void main(String[] args) {

		
		int sum=0;
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		String url="https://www.cricbuzz.com/live-cricket-scorecard/21201/pak-vs-nz-1st-odi-pakistan-v-new-zealand-in-uae-2018";
		
		driver.get(url);
		
		WebElement firstInningsTable = driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		
		List<WebElement> runsColumn = firstInningsTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		
		for(int i=0;i<runsColumn.size()-2;i++) {
			
			String scoreText = runsColumn.get(i).getText();
			
			int scoreIntValue = Integer.parseInt(scoreText);
			
			sum+=scoreIntValue;
		}
		
		String extraText = firstInningsTable.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		int extraScoreIntValue = Integer.parseInt(extraText);
		
		String totalScoreText = firstInningsTable.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		int totalScoreIntValue = Integer.parseInt(totalScoreText);
		
		int totalScore=sum+extraScoreIntValue;
		
		System.out.println(totalScore);
		
		System.out.println(totalScoreIntValue);
		
		if(totalScore==totalScoreIntValue)
			
			System.out.println("Total score matches with sum");
		else
			System.out.println("Total score is not matching with sum");
			
			
	}

}

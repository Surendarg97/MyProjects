package wgs.extenreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSample {
	
	ExtentReports extentReport;
	
	@BeforeTest
	public void extentReportConfig() {
		
		//ExtentReports and ExtentSparkReporter

		String pathOfTheExtentReport = System.getProperty("user.dir")+"\\extentreports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(pathOfTheExtentReport);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport= new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Tester", "Surendar");
		
		
	}	
	
	
	@Test
	public void chromeBrowserInvoke() {
		
		ExtentTest testObeject = extentReport.createTest("chromeBrowserInvoke");
		
		System.setProperty("webdriver.chrome.driver","E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		
		testObeject.fail("Intentionally failed");
		
		extentReport.flush();
	}
	
	

}

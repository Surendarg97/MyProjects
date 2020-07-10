package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	

	public WebDriver driver;
	
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");
		
		//String browserName = System.getProperty("browser");
		
		System.out.println(browserName);

		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

			ChromeOptions options= new ChromeOptions();
			
			if(browserName.contains("headless"))
			{
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "‪E:\\Files\\Selenium learning from udemy course\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			// IE browser invoking
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		return driver;

	}
	
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		String destinationPath= System.getProperty("user.dir")+"\\extentreports\\"+testCaseName+".png";
		
		FileUtils.copyFile(sourceFile, new File(destinationPath));
		
		return destinationPath;
		
		
	}
	
	

}

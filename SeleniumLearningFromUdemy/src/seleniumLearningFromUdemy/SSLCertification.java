package seleniumLearningFromUdemy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

public class SSLCertification {

	public static void main(String[] args) throws IOException {
		
		DesiredCapabilities chromeDesiredCapabilities = DesiredCapabilities.chrome();

		//chromeDesiredCapabilities.acceptInsecureCerts();
		
		chromeDesiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		chromeDesiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions co= new ChromeOptions();
		
		co.merge(chromeDesiredCapabilities);
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		String url="https://www.google.com/";
		
		driver.get(url);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src,new File("E://screenshot.png"));
		
	}

}

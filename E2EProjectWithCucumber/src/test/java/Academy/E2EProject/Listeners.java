package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReportNG;

public class Listeners extends Base implements ITestListener{

	ExtentReports extentReport=ExtentReportNG.getExtentReportData();
	
	ExtentTest extent;
	
	ThreadLocal<ExtentTest> et=new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {

		extent = extentReport.createTest(result.getMethod().getMethodName());
		
		et.set(extent);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		et.get().log(Status.PASS, "Test is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		et.get().fail(result.getThrowable());
		
		WebDriver driver=null;

		String testCaseName = result.getMethod().getMethodName();

		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
		}
		
		try {
			
			et.get().addScreenCaptureFromPath(getScreenshotPath(testCaseName,driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {

		extentReport.flush();
	}

}

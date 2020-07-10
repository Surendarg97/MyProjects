package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extentReport;
	
	public static ExtentReports getExtentReportData() {
		
		//ExtentReports and ExtentSparkReporter

		String pathOfTheExtentReport = System.getProperty("user.dir")+"\\extentreports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(pathOfTheExtentReport);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport= new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Tester", "Surendar");
		
		return extentReport;
	}

}

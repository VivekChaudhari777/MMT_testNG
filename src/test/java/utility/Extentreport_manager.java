package utility;

import org.testng.ITestListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
	import org.testng.ITestResult;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.BaseClass;


	public class Extentreport_manager extends BaseClass implements ITestListener{
	
		public ExtentSparkReporter sparkReporter;  // UI of the report
		public ExtentReports extent;  //populate common info on the report
		public ExtentTest test; // creating test case entries in the report and update status of the test methods

		public void onStart(ITestContext context) {
				
			sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Extentreport\\MyReport.html");//specify location of the report
			
			sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
			sparkReporter.config().setReportName("Functional Testing"); // name of the report
			sparkReporter.config().setTheme(Theme.STANDARD);
			
			extent=new ExtentReports();
			extent.attachReporter(sparkReporter);
			
			extent.setSystemInfo("Computer Name","2304157");
			extent.setSystemInfo("Environment","QA");
			extent.setSystemInfo("Tester Name","vivek");
			extent.setSystemInfo("os","Windows10");
			extent.setSystemInfo("Browser name","Chrome,Firefox,Edge");
						
		}


		public void onTestSuccess(ITestResult result) {
			
			test = extent.createTest(result.getName()); // create a new entry in the report
			test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
			
			File scrFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
			//The below method will save the screen shot in d drive with name "screenshot.png"
			File screenShotName = new File(System.getProperty("user.dir")+"\\Screenshorts\\"+result.getName()+".png");
			try {
				FileUtils.copyFile(scrFile, screenShotName);
			} catch (IOException e) {
				e.printStackTrace();
			}
			test.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".png");
		}
			
		

		public void onTestFailure(ITestResult result) {
			
			test = extent.createTest(result.getName());
			test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
			test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
						
		}

		public void onTestSkipped(ITestResult result) {

			test = extent.createTest(result.getName());
			test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
			
		}

		
		public void onFinish(ITestContext context) {
			
			extent.flush();
		}
			
		
	}




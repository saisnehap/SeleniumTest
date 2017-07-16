package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class FCI_Listener implements ISuiteListener,ITestListener,IInvokedMethodListener {
//WebDriver driver = FCI_TestConfig.driver;
WebDriver driver;
String filePath = "F:\\SCREENSHOTS";

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println("Test Case Started : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case PASS : "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    	takeScreenShot(methodName);

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case SKIPPED : "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("--OnStart"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("--OnFinish"+context.getName());
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Test Suite Started for: "+suite.getName());
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

		System.out.println("******On Suite Finish");

		if(driver!=null)
			driver.quit();
		
		
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("------ before Invocation Method :"+method.getTestMethod());
		driver = FCI_TestConfig.initiateDriver();
		FCI_TestConfig.mLaunchConcept();
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("----after invocation method :"+method.getTestMethod().toString().trim());
		if(testResult.isSuccess())
			driver.close();
		
		
	}

	
	public void takeScreenShot(String methodName) {
	    	if(driver==null)
	    		driver = FCI_TestConfig.getDriver();
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File("F:\\MyTest\\Screenshots\\"+timeStamp+methodName+".png");
		try {
			FileUtils.copyFile(scrFile, screenShotName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---take screen shot is completed");
		 
	}


}

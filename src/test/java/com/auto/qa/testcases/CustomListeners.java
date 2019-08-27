package com.auto.qa.testcases;

import java.awt.event.ItemEvent;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.auto.qa.base.TestBase;
import com.auto.qa.utils.ScreenShot;

public class CustomListeners extends TestBase implements ITestListener {

	
	ScreenShot ss = new ScreenShot();
	public 	int pass_count = 0;
	public 	int fail_count = 0;
	public 	int skipped_count = 0;
	
	public String passed_names="";
	public String failed_names="";
	public String skipped_names="";

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Starting : "+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+" : Pass");
		pass_count = 	pass_count+1;
		passed_names = passed_names+result.getMethod().getMethodName()+":Passed"+System.lineSeparator();
		
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		fail_count = fail_count+1;
		failed_names =failed_names+ result.getMethod().getMethodName()+":Failed"+System.lineSeparator();
		System.out.println(result.getMethod().getMethodName()+" : Failed");
			try {
				//faild(result.getMethod().getMethodName());
				ss.takescreenshotoffail(result.getMethod().getMethodName());
				System.out.println("Screen shot Done from custom listener");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("done");
		
	
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+" : Skipped");
		skipped_count = skipped_count+1;
		skipped_names = skipped_names+result.getMethod().getMethodName()+":Skipped"+System.lineSeparator();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage : "+result.getMethod().getMethodName()+" : Skipped");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Starting context : "+context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish context: "+context);
		System.out.println("/*******************************");
		int tot_count = pass_count+fail_count+skipped_count;
		System.out.println("No of Test cases executed:"+tot_count);
		System.out.println("No of Test cases Passed  :"+pass_count);
		System.out.println("No of Test cases failed  :"+fail_count);
		System.out.println("No of Test cases skipped :"+skipped_count);
		System.out.println("*******************************\\");
		
		System.out.println("/*******************************");
		System.out.println("Passed Test Case Names");
		System.out.println(passed_names);
		System.out.println("*******************************\\");
		
		System.out.println("/*******************************");
		System.out.println("Failed Test Case Names");
		System.out.println(failed_names);
		System.out.println("*******************************\\");
		
		
		System.out.println("/*******************************");
		System.out.println("Skipped Test Case Names");
		System.out.println(skipped_names);
		System.out.println("*******************************\\");
		
		
		
		
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println("itemStateChanged : "+((ITestResult) e).getMethod().getMethodName());
		
	}

}


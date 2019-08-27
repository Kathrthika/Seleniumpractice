package com.auto.qa.utils;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.auto.qa.base.TestBase;


public class ScreenShot extends TestBase {
	

	public void takescreenshotoffail(String methodname) throws IOException {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			String tt = java.time.LocalTime.now().toString();
			  
			    String tt2=tt.replace(":","_");
			    String tt3=tt2.replace(".","_");
			    String path = "G:\\Automation\\NEWATHMA\\src\\Screenshots\\"+methodname+tt3+".jpg";
			    System.out.println("Screen shot name : "+methodname+tt3+".jpg");
		        FileUtils.copyFile(srcfile, new File(path));
		        
		         //System.out.println(path);
		        
	}}
		         
	




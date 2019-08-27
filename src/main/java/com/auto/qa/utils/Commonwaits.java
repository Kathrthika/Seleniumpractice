package com.auto.qa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.qa.base.TestBase;

public class Commonwaits extends TestBase {
	
public int common_timeouts = 30;
	
	
	
	
	
	
	
	public void sendkeysmethod(WebDriver driver,WebElement ele, String value) {
		driver.manage().timeouts().pageLoadTimeout(common_timeouts,TimeUnit.SECONDS);
			
			new WebDriverWait(driver, common_timeouts).
			until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(value);
		}
		

	
		    public void clickonmethod(WebDriver driver,WebElement ele) throws InterruptedException {
		    	//System.out.println("Printing Element"+ele);
			
		     new WebDriverWait(driver, common_timeouts).
			until(ExpectedConditions.elementToBeClickable(ele));
			//System.out.println("Printing Element"+ele);
		    ele.click();
		    
		    
		}
		    
		    public void deletecockies() {
		    	 driver.manage().deleteAllCookies();
		    }

}

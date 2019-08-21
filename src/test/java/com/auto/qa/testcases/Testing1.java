package com.auto.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testing1 {
	
	public  static WebDriver driver;
	
	
	
	@Test
	public void browse() {
	 System.setProperty("webdriver.chrome.driver", "G:\\chrome\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
}
}

package com.auto.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.auto.qa.utils.Commonwaits;



public class TestBase {
	public  static WebDriver driver;
	Commonwaits cw ;
	

	@BeforeSuite
	public void beforesuite() {
		System.out.println("@beforesuite");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("@aftersuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("@beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("@aftertest");
	}
	
	@BeforeClass
	@Parameters({"url"})
	public void beforeclass(@Optional("http://172.23.25.12/") String url) {
		
		System.out.println("@Before class Launcing Browser");
		//public void browse() {
			 System.setProperty("webdriver.chrome.driver", "G:\\chrome\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().deleteAllCookies();
			 driver.get(url);
			// driver.get("http://172.23.25.12/#/");
	}
	@AfterClass
	public void afterclass() {
		
		System.out.println("@afterclass closing browser");
		driver.quit();
	}
	
	@BeforeMethod
	@Parameters({"un","pwd"})
	public void beforemethod(@Optional("339154") String un,@Optional("admin") String pwd) throws InterruptedException {
		cw = new Commonwaits();
		System.out.println(" beforemethod Login into the Appliction");
		cw.deletecockies();
	
		WebElement un1 = driver.findElement(By.id("username"));
		cw.sendkeysmethod(driver, un1, un);
		//cw.sendkeysmethod(driver, un1, "339154");
		//un.sendKeys("339154");
		
		WebElement pwd1 = driver.findElement(By.id("password"));
		cw.sendkeysmethod(driver, pwd1, pwd);
		//cw.sendkeysmethod(driver, pwd1, "admin");
		
		//pwd.sendKeys("admin");
		WebElement smt_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		cw.clickonmethod(driver, smt_btn);
		//smt_btn.click();
		
		/*if(un.isEnabled()) {
			un.sendKeys("339154");
		}
		else {
			System.out.println("un not enabled");
		}
		if(pwd.isEnabled()) {
			pwd.sendKeys("admin");
		}
		else {
			System.out.println("pwd not enabled");
		}
		
		if(un.isEnabled()) {
			un.sendKeys("339154");
		}
		else {
			System.out.println("un not enabled");
		}
		if(smt_btn.isDisplayed()) {
			smt_btn.click();
		}
		else {
			System.out.println("smt button not enabled");
		}*/
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		
		
		try {
		cw = new Commonwaits();
		cw.deletecockies();
		
	
		
		Thread.sleep(2000);
		
		WebElement more = driver.findElement(By.xpath("//a[@id='account-more']"));
		//WebElement more = driver.findElement(By.xpath("//a[@id='account-more']//span[1]"));
		
		cw.clickonmethod(driver, more);
		
		WebElement logout = driver.findElement(By.xpath("//a[@id='logout']"));
		cw.clickonmethod(driver, logout);
	/*	driver.findElement(By.xpath("//a[@id='account-more']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout']")).click();*/
		System.out.println("@after method log out from the App");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
	}
	
	@AfterClass
	public void aftemethod() throws InterruptedException {
		System.out.println("closing the Application");
		driver.quit();
		/*Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@id='account-more']"));
		driver.findElement(By.cssSelector("span[contains(text(),'Sign out')]"));
		System.out.println("Log out from the Application");*/
		
		//a[@id='account-more']
		//span[contains(text(),'Sign out')]
		
	}
	
	
}

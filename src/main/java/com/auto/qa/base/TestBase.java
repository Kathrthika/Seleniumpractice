package com.auto.qa.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
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
	public void beforeclass() {
		System.out.println("@Before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("@afterclass");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("@beforemethod");
	}
	
	@AfterClass
	public void aftemethod() {
		System.out.println("@aftermethod");
	}
	
	
}

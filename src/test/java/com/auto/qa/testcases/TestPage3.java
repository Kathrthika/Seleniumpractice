package com.auto.qa.testcases;

import org.testng.annotations.Test;

import com.auto.qa.base.TestBase;

public class TestPage3 extends TestBase {
	@Test(groups="sanity")
	public void test1() {System.out.println("TestPage31");}
	@Test
	public void test2() {System.out.println("Test2");}
	@Test
	public void test3() {System.out.println("Test3");}
	@Test(groups="sanity1")
	public void test4() {System.out.println("Test4");}


}

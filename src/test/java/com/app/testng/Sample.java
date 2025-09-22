package com.app.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//this is first changes
public class Sample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
    @Test
	public void test1() {
		System.out.println("Test1 ");
	}
 @Test
    public void test2() {
		System.out.println("Test2");
	}

}

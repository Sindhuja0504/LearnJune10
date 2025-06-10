package com.org.junit;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	//redbus
	static WebDriver driver;
	
	public static void geturl() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%252F1");
	
	}
	public void beforeMethod() {
		System.out.println("before");
		
	}
	public void name() {
		
	}

}

package com.org.script;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropReadscript {
	
	static WebDriver  driver;
	public static void getUrl(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
	}
	public static  String readProp(String path) {
		String value = null;
		try {
			FileReader read = new FileReader(path);
			Properties prop= new Properties();
			prop.load(read);
		String URL =	prop.getProperty("url") ;
		System.out.println(URL);
		String name =	prop.getProperty("username") ;
		System.out.println(name);
		String Password =	prop.getProperty("password") ;
		System.out.println(Password);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return value ;
		
	}

}

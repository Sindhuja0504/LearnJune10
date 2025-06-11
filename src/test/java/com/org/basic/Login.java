package com.org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void loginclass() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("sindhutom");
	driver.findElement(By.id("password")).sendKeys("Testing@123");
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"login\"]")));
	driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	}
//	public static void main(String[] args) {
//		loginclass();
//	}
	
}

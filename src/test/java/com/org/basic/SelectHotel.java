package com.org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectHotel extends SearchHotel{
	public static void selectHotelclass() {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement radiobutton=	driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(radiobutton)).click();
		driver.findElement(By.xpath("//input[@name=\"continue\"]")).click();
		
		
	}



}

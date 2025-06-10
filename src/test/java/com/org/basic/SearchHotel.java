package com.org.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHotel extends Login {

	public static void searchClass() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement location = driver.findElement(By.xpath("//select[@id=\"location\"]"));
		wait.until(ExpectedConditions.visibilityOf(location));
		location.click();
		Select selectloc = new Select(location);
		selectloc.selectByValue("London");
		WebElement element2 = driver.findElement(By.cssSelector("select#hotels"));
		Select select2 = new Select(element2);
		select2.selectByVisibleText("Hotel Creek");
		WebElement element3 = driver.findElement(By.cssSelector("select#room_type"));
		Select select3 = new Select(element3);
		select3.selectByVisibleText("Double");
		WebElement element4 = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select select4 = new Select(element4);
		select4.selectByIndex(2);
		WebElement checkin = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		checkin.clear();
		checkin.sendKeys("20/06/2025");
		WebElement checkout = driver.findElement(By.cssSelector("input#datepick_out"));
		checkout.clear();
		checkout.sendKeys("22/06/2025");
		WebElement element5 = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
		Select select5 = new Select(element5);
		select5.selectByIndex(3);
		WebElement element6 = driver.findElement(By.cssSelector("select#child_room"));
		Select select6 = new Select(element6);
		select6.selectByIndex(1);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement click = driver.findElement(By.xpath("//input[@name=\"Submit\"]"));
		click.click();

		System.out.println("ok");

	}

}

package com.org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookHotel extends SelectHotel {

	public static void bookHotelClass() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// WebElement firstname=
		// driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
		firstname.sendKeys("sindhuja");
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		lastname.sendKeys("ravi");
		WebElement address = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
		address.sendKeys("chennai123");
		WebElement cardno = driver.findElement(By.xpath("(//input[@class=\"reg_input\"])[3]"));
		cardno.sendKeys("1234567890987654");
		WebElement cardtype = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
		cardtype.click();
		Select select = new Select(cardtype);
		select.selectByIndex(2);
		WebElement month = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		month.click();
		Select select1 = new Select(month);
		select1.selectByIndex(4);

		WebElement year = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		year.click();
		Select select2 = new Select(year);
		select2.selectByVisibleText("2029");
		WebElement cvv = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
		cvv.sendKeys("3455");
		driver.findElement(By.xpath("(//input[@type=\"button\"])[1]")).click();

		System.out.println("done");

	}

	public static void orderid() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// WebElement firstname=
		// driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		WebElement id = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class=\"disable_text\"])[15]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object value = js.executeScript("return arguments[0].value", id);
		System.out.println("order id: " + value);
	}

	public static void main(String[] args) {
		loginclass();
		searchClass();
		selectHotelclass();
		bookHotelClass();
		orderid();

	}

}

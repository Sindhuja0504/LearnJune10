package com.org.script;

import org.openqa.selenium.By;

public class ExcelBaseClass extends ExcelScriptClass{
	
	public static void main(String[] args) throws InterruptedException {
		geturl("https://adactinhotelapp.com/index.php");
		login(By.xpath("//input[@id=\"username\"]"),"Sheet1", 0, 0);
		login(By.id("password"),"Sheet1", 5, 2);
		clickelement(By.id("login"));
		dropdowns(By.cssSelector("select#location"), "Sheet1", 1, 0);
		dropdowns(By.cssSelector("select#location"), "Sheet1", 1, 0);
		dropdowns(By.cssSelector("select#hotels"), "Sheet1", 2, 0);
		dropdowns(By.cssSelector("select#room_type"), "Sheet1", 3, 0);
		dropdowns(By.xpath("//select[@name=\"room_nos\"]"), "Sheet1", 4, 0);
		dropdowns(By.xpath("(//input[@type=\"text\"])[2]"), "Sheet1", 2, 6);
		dropdowns(By.cssSelector("input#datepick_out"), "Sheet1", 5, 0);
		dropdowns(By.xpath("//select[@name=\"adult_room\"]"), "Sheet1", 6, 2);
		dropdowns(By.cssSelector("select#child_room"), "Sheet1", 6, 3);
		clickelement(By.id("Submit"));
		//waitmethod(By.cssSelector("input#radiobutton_0"))
		clickelement(By.cssSelector("input#radiobutton_0"));
		clickelement(By.id("continue"));
		//waitmethod(By.xpath("//input[@id=\"first_name\"]"));
		login(By.xpath("//input[@id=\"first_name\"]"), "Sheet1", 7, 0);
		login(By.xpath("//input[@name=\"last_name\"]"), "Sheet1", 7, 1);
		login(By.xpath("//textarea[@name=\"address\"]"), "Sheet1", 8, 1);
		login(By.id("cc_num"), "Sheet1", 0, 1);
		dropdowns(By.cssSelector("select#cc_type"), "Sheet1", 10, 0);
		dropdowns(By.xpath("//select[@id=\"cc_exp_month\"]"), "Sheet1", 11, 0);
		dropdowns(By.xpath("//select[@id=\"cc_exp_year\"]"), "Sheet1", 12, 0);
//		System.out.println("date");
	    login(By.xpath("//input[@name=\"cc_cvv\"]"), "Sheet1", 13, 0);
//		login(By.xpath("//input[@id=\"cc_cvv\"]"), "Sheet1", 13, 0);
		clickelement(By.xpath("//input[@id=\"book_now\"]"));
		//Thread.sleep(3000);
		//orderid(By.xpath("//input[@name=\"order_no\"]"));
		scroll(By.linkText("www.adactin.com"));
		orderid(By.xpath("//input[@name=\"order_no\"]"), "Sheet1", 14, 0);
		System.out.println("done");
	}
	
	
	
	

}

package com.org.script;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelScriptClass {

	static WebDriver driver;
	static WebDriverWait wait;

	public static void geturl(String Url) {
		driver = new ChromeDriver();
		// driver.new
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/index.php");

	}

	public static void login(By by, String sheetname, int r, int c) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement waitelement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\projectHotel.xlsx");
		// File fl= new
		// File("C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\WorkingWith_1.xlsx");
		try {
			FileInputStream inputstream = new FileInputStream(fl);
			Workbook workbook = new XSSFWorkbook(inputstream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			int celltype = cell.getCellType();
			System.out.println("cellvalue:" + cell);
			String value = cell.toString();
//			if (celltype == 1) {
//				String value = cell.toString();
//				waitelement.sendKeys(value);
//				System.out.println("cell to string: " +value);
//				
//			} else {
//			double doublevalue=	cell.getNumericCellValue();
//			int longvalue = (int)doublevalue;
//			System.out.println();
//			waitelement.sendKeys(String.valueOf(longvalue));
//			System.out.println("login value: "+longvalue);
//				
//
//			}
			waitelement.sendKeys(value);
			System.out.println("cell to string: " + value);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public static void clickelement(By by) {
		driver.findElement(by).click();
		System.out.println("clicked");

	}

	public static void orderid(By by, String sht, int r, int c) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		// WebElement element = driver.findElement(by);
		// System.out.println("order id: " + element.getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object object = js.executeScript("return arguments[0].value", element);
		System.out.println("order id: " + object);

		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\projectHotel.xlsx");
		try {
			FileInputStream input = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(input);
			Sheet sheet = wk.getSheet(sht);
			Row row = sheet.createRow(r);
			Cell cell = row.createCell(c);
			String order = object.toString();
			cell.setCellValue(order);
			FileOutputStream output = new FileOutputStream(fl);
			wk.write(output);
			wk.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public static void dropdowns(By by, String sheetname, int r, int c) {

		try {
			WebElement element = driver.findElement(by);
			element.click();
			
			File fl = new File(
					"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\projectHotel.xlsx");
			FileInputStream inputstream = new FileInputStream(fl);
			Workbook workbook = new XSSFWorkbook(inputstream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			int celltype = cell.getCellType();
			System.out.println(cell);

			if (celltype == 1) {
				String stringvalue = cell.toString();
				Select select = new Select(element);
				select.selectByVisibleText(stringvalue);
			} else if (celltype == 0) {

				if (DateUtil.isCellDateFormatted(cell)) {
					element.clear();
					Date date = cell.getDateCellValue();
					SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/YYYY");
					String format = simpledate.format(date);
					element.sendKeys(format);
					System.out.println(format);

				} else {

					double doublevalue = cell.getNumericCellValue();
					System.out.println("double:" + doublevalue);
					long intvalue = (long) doublevalue;
					System.out.println("int:" + intvalue);
					String value = String.valueOf(intvalue);
					System.out.println(value);

					Select select = new Select(element);
					select.selectByVisibleText(value);
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static  void scroll(By by) {
	WebElement element=	driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "") ;
		//js.executeScript("window.scrollBy(0,400)", "element");
		js.executeScript("arguments[0].scrollIntoView()", element);
		System.out.println("scroll");
		
	}

}

package com.org.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWrite {

	public static void writeData( int r, int c,String value) {
		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\FileAutomation1.xlsx");
		try {
			FileInputStream inputstream = new FileInputStream(fl);
			Workbook workbook = new XSSFWorkbook(inputstream);
			Sheet sheet = workbook.getSheet("sheet3");
			Row row = sheet.createRow(r);
			Cell cell = row.createCell(c);
			cell.setCellValue(value);
			FileOutputStream output = new FileOutputStream(fl);
			workbook.write(output);
			workbook.close();
			System.out.println("completed");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("started");
		writeData( 5, 1, "sriram");
		writeData( 4, 2, "toms");

	}

}

package com.org.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public static void excelRead1(String sht, int r, int c) {

		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\FileAutomation1.xlsx");

		try {
			FileInputStream stream = new FileInputStream(fl);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sht);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			System.out.println(cell);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readAllExcel() {
		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\FileAutomation1.xlsx");
		try {
			FileInputStream fileinput = new FileInputStream(fl);
			Workbook workbook = new XSSFWorkbook(fileinput);
			Sheet sheet = workbook.getSheet("Sheet1");
			int physicalrow = sheet.getPhysicalNumberOfRows();
			//System.out.println("ROWS: "+ physicalrow);
			for (int i = 0; i < physicalrow; i++) {
				Row row = sheet.getRow(i);

				int physicalcells = row.getPhysicalNumberOfCells();
				//System.out.println("CELL: " + physicalcells);
				for (int j = 0; j < physicalcells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readFormat() {
		File fl = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\MyNew\\src\\test\\resources\\Files\\FileAutomation1.xlsx");
		try {
			FileInputStream inputstream = new FileInputStream(fl);
			Workbook workbook = new XSSFWorkbook(inputstream);
			Sheet sheet = workbook.getSheet("Sheet1");
			int physicalrows = sheet.getPhysicalNumberOfRows();
			
			for (int i = 0; i < physicalrows; i++) {
				Row row = sheet.getRow(i);
				int physicalcells = row.getPhysicalNumberOfCells();
				System.out.println(physicalcells);
				for (int j = 0; j < physicalcells; j++) {
					Cell cell = row.getCell(j);
					int celltype = cell.getCellType();
					System.out.println("cell type: " + celltype);
					if (celltype == 1) {
						
						System.out.println("string: " + cell);

					} else if (celltype == 0) {

						if (DateUtil.isCellDateFormatted(cell)) {
							Date getdatecellvalues = cell.getDateCellValue();
							SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
						String format=	dateformat.format(getdatecellvalues);
						System.out.println(format);
						}
						else {
						double numericvalue= cell.getNumericCellValue();
						long number = (long)numericvalue;
						System.out.println(number);
							
						}
					}

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// excelRead1("Sheet1", 2, 1);
		//readAllExcel();
		readFormat();

	}

}

package com.kavi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest {
	public static void main(String[] args) throws IOException {

		File fi = new File("C:\\Users\\Kaviraj S\\eclipse-workspace\\Maven\\input\\excel.xlsx");

		FileInputStream fileInputStream = new FileInputStream(fi);

		Workbook wk = new XSSFWorkbook(fileInputStream);

		Sheet sheet = wk.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		for (int j = 0; j < physicalNumberOfRows; j++) {
			Row r = sheet.getRow(j);
			// System.out.println(r);

			int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			System.out.println(physicalNumberOfCells);

			for (int i = 0; i < physicalNumberOfCells; i++) {

				Cell c = r.getCell(i);

				System.out.println(c);
			}
		}

	}

}

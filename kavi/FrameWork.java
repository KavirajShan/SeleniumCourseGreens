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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork {

	public static void main(String[] args) throws IOException {

		// WebDriverManager.chromedriver().setup();
		//
		// WebDriver driver = new ChromeDriver();
		//
		// driver.get("https://www.facebook.com/");

		File file = new File("C:\\Users\\Kaviraj S\\eclipse-workspace\\Maven\\input\\excel.xlsx");

		// To read the excel

		FileInputStream fileInputStream = new FileInputStream(file);

		// To set the workbook name

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		//Sheet ref
		
	Sheet sheet = workbook.getSheet("sheet1");
	
	
	//row ref
	
	Row row = sheet.getRow(0);
	
	//cell
	
	Cell cell = row.getCell(0);
	
	System.out.println(cell);
	
	
	}

}

package com.app.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Read {
	
	public static void excel_Read() {
			
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\gitaug"
					+ "\\Sep_2025\\src\\test\\resources\\TestData\\test_2025_sep.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			System.out.println(cell);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void excel_Read_All() {
		
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\gitaug"
					+ "\\Sep_2025\\src\\test\\resources\\TestData\\test_2025_sep.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			//to fetech all data from excel
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for(int i=0; i<physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				//to fetech all data from excel
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for(int j=0; j<physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					//System.out.println(cell);
					int cellType = cell.getCellType();
					if(cellType==1) {
						String value = cell.getStringCellValue();
					System.out.println(value);	
					}else if(cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							//System.out.println(dateCellValue);
							SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yy");
							String format = sm.format(dateCellValue);
							System.out.println(format);	
						}else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long)numericCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
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
	

public static String excel_Read_reuse(int i , int j) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\gitaug"
					+ "\\Sep_2025\\src\\test\\resources\\TestData\\test_2025_sep.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
				Row row = sheet.getRow(i);
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if(cellType==1) {
						value = cell.getStringCellValue();
					System.out.println(value);	
					}else if(cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							//System.out.println(dateCellValue);
							SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yy");
							value = sm.format(dateCellValue);
							System.out.println(value);	
						}else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long)numericCellValue;
							value = String.valueOf(l);
							System.out.println(value);
						}
					}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys(excel_Read_reuse(1,1));
}

}

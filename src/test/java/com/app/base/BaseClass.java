package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static void launchBrowser(String browser)
	{
		switch(browser)
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Browser is not Valid");
		}
	}
	public static void loadURL(String URL)
	{
		driver.get(URL);
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void clickElement(WebElement element)
	{
		element.click();
	}
	public static void Input(WebElement element,String data)
	{
		element.clear();
		element.sendKeys(data);
	}
	public static void dropVisibleText(WebElement element, String data)
	{
		Select visible=new Select(element);
		visible.selectByVisibleText(data);
	}
	public static void dropValue(WebElement element, String data)
	{
		Select value=new Select(element);
		value.selectByValue(data);
	}
	public static void wait(int milliseconds) throws InterruptedException
	{
		Thread.sleep(milliseconds);
	}
	public static void waitTillElement(By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement elementFound=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String OrderID=elementFound.getAttribute("value");
		System.out.println("OrderID found is..."+OrderID);
	}
	public static void WaitTillInvisible(String data)
	{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(data)));
        //Boolean element3 = wait.until(ExpectedConditions.invisibilityOf(element2)));

	}
	public static String getCellType(String Sheet,int rowNum, int colNum)
	{
		String res=null;
		File F=new File("C:\\Automation\\AutomationMaven\\Locators_BaseClass\\src\\test\\resources\\TestData\\Hotel_Inputs.xlsx");
		try
		{
			FileInputStream fis=new FileInputStream(F);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheet=wb.getSheet(Sheet);
			Row row=sheet.getRow(rowNum);
			Cell cell=row.getCell(colNum);
			int cellType=cell.getCellType();
			if(cellType==1)
			{
				res=cell.getStringCellValue();
			}
			else if(cellType==0)
			{
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date dateCellValue=cell.getDateCellValue();
					SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yy");
					res=sm.format(dateCellValue);
				}
				else
				{
					double numericCellValue=cell.getNumericCellValue();
					long l=(long)numericCellValue;
					res=String.valueOf(l);
				}
			}
		}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		return res;
	}
	public static String read_props(String key)
	{
		String propvalue=null;
		try
		{
			FileReader fileRead= new FileReader(new File("C:\\Automation\\AutomationMaven\\BaseClassTask\\src\\test\\resources\\TestData\\resource.properties"));
			Properties prop=new Properties();
			prop.load(fileRead);
			propvalue=prop.getProperty(key);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		return propvalue;
		
	}
	public static String excel_read_reuse(int i , int j) {
		String value = null;
		try {
			File f = new File("C:\\Users\\Madhan\\eclipse-workspace\\selenium\\Domo\\src\\test\\resources\\Testdata\\test_2025_sep.xlsx");
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

}



package com.Mandatory_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class
{
	
	public void Screenshot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot st = (TakesScreenshot) driver;
		
		File src = st.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Automation\\Maven_Project\\ScreenShot"+filename+".jpg");
		
		FileHandler.copy(src, dest);
		
	}

	
	public void fetchData(int rowIndex, int cellIndex) throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\Automation\\My_Project\\Excel_Data\\Login.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook (file);
		
		XSSFSheet sheet = book.getSheet("Flipkart Login");
		
		sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}
}

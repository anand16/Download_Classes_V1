package com.orangehrm.utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelOperations {
	
	public int getRowCount(String file,int sheetno) throws IOException
	{
		FileInputStream f=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		int rowCount=ws.getLastRowNum();
		return rowCount;
		
		
	}
	
	public Row getRow(String file,int sheetno,int rowno) throws IOException
	{
		FileInputStream f=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		Row r=ws.getRow(rowno);
		return r;
		
	}
	
	public String getCellData(String file,int sheetno,int rowno,int cellno) throws IOException
	{
		FileInputStream f=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		String data=ws.getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
	
	

}

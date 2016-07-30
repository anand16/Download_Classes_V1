package com.orangehrm.baseclass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pageclass.AddEmployeePage;
import com.orangehrm.pageclass.Menu;

public class AddEmployee  extends Constants{
	@Test
	public void addEmpTest() throws IOException
	{
		driver.manage().window().maximize();
		Menu menu=PageFactory.initElements(driver,Menu.class);
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		
		String runMode=eo.getCellData(dataEngine, 0,2,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Skipping addemp test case");
		}
		int rowCount=eo.getRowCount(empList,0);
		for(int i=1;i<=rowCount;i++)
		{
			menu.pim();
			Row r=eo.getRow(empList,0,i);
			aep.addEmployee(r);
		}
	}

}

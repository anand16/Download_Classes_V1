package com.orangehrm.baseclass;
import org.openqa.selenium.WebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshots;

public class Constants {
	
	static WebDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	Screenshots sc=new Screenshots();
	String empList="D:\\HomeBatchOne\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String scrFolderPath="D:\\HomeBatchOne\\OrangeHRM\\src\\com\\orangehrm\\screenshots\\";
	String dataEngine="D:\\HomeBatchOne\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}

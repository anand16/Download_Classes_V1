package Package.Keyworddriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingReflection {
	keyWords keys=new keyWords();
	Method[]  mymethods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
	
	
	FileInputStream f=new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	int rowCount=ws.getLastRowNum();
	for(int i=1;i<=rowCount;i++)
	{
		Row r=ws.getRow(i);
		String runMode=r.getCell(4).getStringCellValue();
		if(runMode.equals("Y"))
		{
			String keyword=r.getCell(3).getStringCellValue();
			executeMethods(keyword);
		}
	}
			
	}
	
	public void executeMethods(String keyword) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<mymethods.length;i++)
		{
			if(keyword.equals(mymethods[i].getName()))
			{
				mymethods[i].invoke(keys);
			}
			
			
			
		}
	}
	}
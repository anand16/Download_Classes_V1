package Package.Datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datadrivenexampletwo {
	
	WebDriver driver;
	@BeforeMethod
		public void init()
		{
		driver  = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
    	}
	@Test
	public void Logic() throws IOException
		{
		FileInputStream f  = new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\links.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws= wb.getSheet("sheet1");
		int rowcount = ws.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			Row r = ws.getRow(i);
			String link=r.getCell(0).getStringCellValue();
			driver.findElement(By.linkText(link)).click();
			String Actualurl=driver.getCurrentUrl();
			String Expectedurl=r.getCell(1).getStringCellValue();
			r.createCell(2).setCellValue(Actualurl);
			
			if(Actualurl.contains(Expectedurl))
				
			{
				r.createCell(3).setCellValue("Equal");
				
			}
			else
				
			{
				r.createCell(3).setCellValue("UnEqual");
				
			}
			driver.navigate().back();
			
		}
		
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\linksoutput.xlsx");
		wb.write(f1);
	    
			
		
		}
	
}
package Package.Datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatadrivenExampleThree {
	WebDriver driver;
	@BeforeMethod
		public void init()
		{
		driver  = new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill?gclid=Cj0KEQiA3t-2BRCKivi-suDY24gBEiQAX1wiXHzQjiB7wCxXmtBvmz6YHyl8mLVnnshTZ7PD8vlgBzMaApFL8P8HAQ#Z7_JH56H4K0K8MP90AS8PIGS60CN3");
    	}
		
	@Test
	public void Logic() throws IOException
		{
		FileInputStream f  = new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\Ajaxdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws= wb.getSheet("sheet1");
		int rowcount = ws.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			Row r = ws.getRow(i);
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("amountPaid")).click();
			
			//WebElement message=driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div/section/div[2]/div[2]/div[1]/form/div[1]/span[2]/div/label"));
			String message=driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div/section/div[2]/div[2]/div[1]/form/div[1]/span[2]/div/label")).getText();
			String AjaxActual=null;
			if(message.isEmpty())
			{
				AjaxActual="No Ajax";
			}
			else 
			{
				AjaxActual=message;
			}
		r.createCell(2).setCellValue(AjaxActual);
		
		String ExpAjax=r.getCell(1).getStringCellValue();
		
		if(ExpAjax.equals(AjaxActual))
			
		{
			r.createCell(3).setCellValue("Pass");
			
		}
					
		else
		{
			r.createCell(3).setCellValue("Fail");
			
		}
			
		}
		
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\Ajaxdataoutput.xlsx");
		wb.write(f1);
	    
		
		}
}

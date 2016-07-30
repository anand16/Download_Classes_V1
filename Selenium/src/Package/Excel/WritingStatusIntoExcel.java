package Package.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WritingStatusIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		FileInputStream f= new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\DDLWrite.xlsx");
		XSSFWorkbook  wb= new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Sleeper.sleepTight(10);
		WebElement ctrys= driver.findElement(By.name("country"));
		List<WebElement> links=ctrys.findElements(By.tagName("option"));
		for(int i=0;i<links.size();i++)
			
		{
			String countryname= links.get(i).getText();
			Row r = ws.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(countryname);
			//System.out.println(countryname);
			
			links.get(i).click();
			
			
			if(links.get(i).isSelected())
			
			{
			c = r.createCell(1);
			c.setCellValue("Pass");
			}
		
			else
			{
				
				 c = r.createCell(1);
				c.setCellValue("Fail");
				
			}
		
		}//for
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\DDLWrite.xlsx");
		wb.write(f1);
	//	f1.close();;
		

	}

}

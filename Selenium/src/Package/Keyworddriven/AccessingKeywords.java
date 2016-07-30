package Package.Keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessingKeywords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    keyWords ky= new keyWords();
    FileInputStream f  = new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\LoginKeywords.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(f);
	XSSFSheet ws= wb.getSheet("sheet1");
	int rowcount = ws.getLastRowNum();
	
	for(int i=1;i<=rowcount;i++)
		
	{
		Row r= ws.getRow(i);
		String run=r.getCell(4).getStringCellValue();
		
		if(run.equals("Y"))
		{
			String method=r.getCell(3).getStringCellValue();
			
			if(method.equals("launchBrowser"))
				
			{
				ky.launchBrowser();
			}
				
			else if(method.equals("navigate"))
			{
				ky.navigate();
				
			}
			else if(method.equals("enterUsername"))
				
			{
				ky.enterUsername();
				
			}
			
			else if(method.equals("buttonOne"))
				
			{
				
				ky.buttonOne();
			}
			
			else if(method.equals("enterPasword"))
				
			{
				
				ky.enterPasword();
			}
			
			else if(method.equals("buttonTwo"))
				
			{
				
				ky.buttonTwo();
			}
							
		}
		
	}
    
	}

}

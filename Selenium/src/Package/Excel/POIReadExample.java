package Package.Excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIReadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f = new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelData.xlsx");
XSSFWorkbook wb= new XSSFWorkbook(f);
XSSFSheet ws= wb.getSheet("sheet1");
int rowcount = ws.getLastRowNum();
for(int i=0;i<=rowcount;i++)
{
	Row r = ws.getRow(i);
	int colcount = r.getLastCellNum();
	for(int j=0;j<colcount;j++)
		
	{
		Cell c = r.getCell(j);
		System.out.print(c.getStringCellValue()+ "");
		
	}
	System.out.println();
}










	}

}

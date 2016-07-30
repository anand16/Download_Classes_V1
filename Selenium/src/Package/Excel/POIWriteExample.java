package Package.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelDataUpdate.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet ws= wb.getSheet("sheet1");

		//overwriing
	Row r = ws.getRow(0);
	Cell c = r.getCell(1);
	c.setCellValue("hello1");
	  //writing in blank cell
	r = ws.getRow(1);
	c = r.createCell(3);
	c.setCellValue("hello2");
	//writing a new row
	
	/*ws.createRow(3);
	r.createCell(0);
	c.setCellValue("hello3");
	*/
	  
	
	FileOutputStream f1= new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelDataUpdate.xlsx");
	wb.write(f1);
	}

}

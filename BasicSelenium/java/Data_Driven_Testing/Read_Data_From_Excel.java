package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_Excel {
	public static void main(String[] args) throws Exception, IOException {
		//Step 1:get the Excel path location & java Object of the physical ExcelFile
		FileInputStream fis=new FileInputStream(".\\commonData\\testScriptdata.xlsx");
		
		//Step 2:Open WorkBook in read mode
		Workbook wb=WorkbookFactory.create(fis);
		
		//Step 3:get the control of the "org" sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//Step 4:get the control of the "1st" Row
		Row row=sh.getRow(1);
		
		//Step 5:get the control of the "2nd"Cell &read the string data
		Cell cel=row.getCell(2);
		String data=cel.getStringCellValue();
		System.out.println(data);
		
		wb.close();
	}

}

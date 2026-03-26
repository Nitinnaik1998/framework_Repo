package Advanced_Selenium_Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("./commonData/CopytestscriptdataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(1);
		Cell cell=row.getCell(1);
		String data=cell.getStringCellValue();
		String data2=row.getCell(3).toString();
		System.out.println(data2);
		
		System.out.println(data);
		wb.close();

	}
}

package Advanced_Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws Exception, IOException {
			FileInputStream fis=new FileInputStream(".\\commonData\\ReadMultipleData.xlsx");
					Workbook wb=WorkbookFactory.create(fis);
					Sheet sh=wb.getSheet("Sheet1");
					int count=sh.getLastRowNum();
					
					for(int i=0; i<count; i++) {
					Row row=sh.getRow(i);
					String data=row.getCell(0).toString();
					String data2=row.getCell(1).toString();
					System.out.println(data +"\t"+data2);
					
					
			    
	}
wb.close();
}
}

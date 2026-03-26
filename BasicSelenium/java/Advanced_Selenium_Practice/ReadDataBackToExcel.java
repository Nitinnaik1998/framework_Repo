package Advanced_Selenium_Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBackToExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(".\\commonData\\Nitin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.createRow(3);
		Cell cell0=row.createCell(0);
		cell0.setCellType(CellType.STRING);
		cell0.setCellValue("01");
		Cell cell1=row.createCell(1);
		cell1.setCellType(CellType.STRING);
		cell1.setCellValue("Phone");
		Cell cell2=row.createCell(2);
		cell2.setCellType(CellType.STRING);
		cell2.setCellValue("Low");
		Cell cell3=row.createCell(3);
		cell3.setCellType(CellType.STRING);
		cell3.setCellValue("P3");
		Cell cell4=row.createCell(4);
		cell4.setCellType(CellType.STRING);
		cell4.setCellValue("RanuRaghavMotiRanu");
		
		
		FileOutputStream fos = new FileOutputStream("./commonData/Nitin.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}

}

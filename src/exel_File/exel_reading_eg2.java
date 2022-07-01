package exel_File;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_reading_eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File exelfname=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		
		Workbook Book = WorkbookFactory.create(exelfname);
		Sheet sheet = Book.getSheet("mysheet");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);
		CellType type = cell.getCellType();
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);  
		
		
	}

}

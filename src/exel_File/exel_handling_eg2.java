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

public class exel_handling_eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");

		Workbook exelfile = WorkbookFactory.create(myfile);
		Sheet sheetname = exelfile.getSheet("mysheet");
		
		Row row1 = sheetname.getRow(1);
		Cell cell1 = row1.getCell(0);
		String value = cell1.getStringCellValue();
		System.out.println(value);
		CellType type = cell1.getCellType();
		System.out.println(type);
		System.out.println("+++++++++++++");
		
		//date read
		String datev = sheetname.getRow(1).getCell(1).getStringCellValue();
		System.out.println("date is "+datev);
		
		//time read
		String time = sheetname.getRow(1).getCell(3).getStringCellValue();
		System.out.println("time is "+time);
		
		//
		String svalue = sheetname.getRow(1).getCell(4).getStringCellValue();
        System.out.println("sp charactor value is "+svalue);
	}

}

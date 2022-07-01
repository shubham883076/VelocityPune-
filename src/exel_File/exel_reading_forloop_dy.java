package exel_File;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_reading_forloop_dy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File exelfname=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		Sheet mysheets = WorkbookFactory.create(exelfname).getSheet("Sheet2");
		
		int lastrowno = mysheets.getLastRowNum();
		int totalrowsno = lastrowno;    
		System.out.println(totalrowsno);
		
		int lastcellno = mysheets.getRow(0).getLastCellNum();
		int totalcellno = lastcellno;            
		System.out.println(totalcellno);
		
		//dynamic coding for whole column read
		for (int i=0;i<=totalrowsno;i++)
		{
		    String value = mysheets.getRow(i).getCell(1).getStringCellValue();
			System.out.print(value+"   ");
		}
		System.out.println();
		
		//dynamic coding for whole row read
		for (int i=0;i<=totalcellno-1;i++)
		{
		    String value = mysheets.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+"   ");
		}
		
		
	}

}

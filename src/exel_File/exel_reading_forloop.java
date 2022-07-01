package exel_File;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_reading_forloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File exelfname=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
        Sheet mysheets = WorkbookFactory.create(exelfname).getSheet("mysheet");
		
		//static coding for whole row read
		for(int i=0;i<=4;i++)
		{
		 String values = mysheets.getRow(2).getCell(i).getStringCellValue();
		 System.out.print(values+"    ");
		}
	    System.out.println();

        //static coding for whole cell read
	    for(int i=2;i<=6;i++)
		{
		String values = mysheets.getRow(i).getCell(1).getStringCellValue();
		System.out.print(values+"    ");
		}
        System.out.println();
		for(int i=3;i<=7;i++)
		{
		long values = (long) mysheets.getRow(i).getCell(2).getNumericCellValue();
		System.out.print(values+"    ");
		}
		
	}

}

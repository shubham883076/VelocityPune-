package exel_File;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_File_handling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile =new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		
		String name1 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(2).getCell(0).getStringCellValue();
		System.out.print(name1+"     ");
		
		double name2 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(name2);
		
		String txt1 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(2).getCell(2).getStringCellValue();
        System.out.print(txt1+"    ");
		
		long name3 = (long) WorkbookFactory.create(myfile).getSheet("mysheet").getRow(3).getCell(2).getNumericCellValue();
		System.out.println(name3);
		
		String name5 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(2).getCell(3).getStringCellValue();
		System.out.print(name5+ "  ");
		
		String txt4 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(7).getCell(3).getStringCellValue();
		System.out.println(txt4);
		        
		String name6 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(2).getCell(4).getStringCellValue();
		System.out.print(name6+ "  ");
		
        boolean txt6 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(3).getCell(4).getBooleanCellValue();
		System.out.print(txt6+ "       ");
		
		boolean txt7= WorkbookFactory.create(myfile).getSheet("mysheet").getRow(7).getCell(4).getBooleanCellValue();
		System.out.println(txt7);
		
//		String name10 = WorkbookFactory.create(myfile).getSheet("mysheet").getRow(3).getCell(5).
//		System.out.println(name10);
	}

}

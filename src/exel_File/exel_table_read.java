package exel_File;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_table_read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File exelfname=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		Sheet mysheet = WorkbookFactory.create(exelfname).getSheet("Sheet3");
		
		int lastrno = mysheet.getLastRowNum();
		int totalrows = lastrno;
		System.out.println(totalrows);
		
		int lastcellno = mysheet.getRow(0).getLastCellNum();
		System.out.println(lastcellno);
		int totalcells = lastcellno-1;
	    System.out.println(totalcells);
	    
	    //dynamic coding for whole table read
	    for(int i=0;i<=totalrows;i++)
	    {
	    	for(int j=0;j<=totalcells;j++)
	    	{
	    		String table = mysheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(table+"     ");
	    	}
	    	System.out.println();
	    } 
	    System.out.println("============================");
	 
	   //static coding for table read   
	    for(int i=0;i<=9;i++)
	    {
	    	for(int j=0;j<=3;j++)
	    	{
	    		String table = mysheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(table+"     ");
	    	}
	    	System.out.println();
	    } 
	    
	    
	    
}
}

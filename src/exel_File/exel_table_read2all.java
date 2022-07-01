package exel_File;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_table_read2all {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("mysheet");
		int totalrows = sheet.getLastRowNum();
		int totalcell = sheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=totalrows;i++)
		{
			for(int j=0;j<=totalcell;j++)
			{
			  Cell cell = sheet.getRow(i).getCell(j);
			  
			CellType type = cell.getCellType();
			
			  if(type==CellType.NUMERIC)
			  {
				  System.out.print(cell.getNumericCellValue()+"  ");
			  }
			  else if(type==CellType.STRING)
			  {
				  System.out.print(cell.getStringCellValue()+"  ");
			  }
			  else if(type==CellType.BOOLEAN)
			  {
				 System.out.print(cell.getBooleanCellValue()+"  "); 
			  }
			  else if(type==CellType.BLANK)
			  {
				 System.out.print("  "); 
			  }
			  
			  
			}
			System.out.println();
		}
		
}
}

package POM_Framewok_dynamic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerodha_testingclassforloop {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		int totalrows = mysheet.getLastRowNum();
		System.out.println(totalrows);
		
		for(int i=0;i<=totalrows-1;i++)
		{
			String username = mysheet.getRow(i).getCell(0).getStringCellValue();
			String password = mysheet.getRow(i).getCell(1).getStringCellValue();
			String kitepin = mysheet.getRow(i).getCell(2).getStringCellValue();
		
		
		zerodha_loginpage login= new zerodha_loginpage(driver);
		login.sendusername(username);
		login.sendpassword(password);
		login.clickloginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		zerodha_pinpage pinin=new zerodha_pinpage(driver);
		pinin.senduserpin(kitepin);
		pinin.clickcontinuebutton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		zerodha_homepage homep=new zerodha_homepage(driver);
		homep.validateUserID(username);
		homep.clickOnLogoutButton();
		
		driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
		
		}
	  //  driver.close();	
}
	
}

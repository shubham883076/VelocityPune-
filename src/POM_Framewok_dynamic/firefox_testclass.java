package POM_Framewok_dynamic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\New folder\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("kitezerodha");
		String username = mysheet.getRow(0).getCell(1).getStringCellValue();
		String password = mysheet.getRow(1).getCell(1).getStringCellValue();
		String kitepin = mysheet.getRow(2).getCell(1).getStringCellValue();
		
		zerodha_loginpage login= new zerodha_loginpage(driver);
		login.sendusername(username);
		login.sendpassword(password);
		login.clickloginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		zerodha_pinpage pinin=new zerodha_pinpage(driver);
		pinin.senduserpin(kitepin );
		pinin.clickcontinuebutton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		zerodha_homepage homep=new zerodha_homepage(driver);
		homep.validateUserID(username);
		homep.clickonprofile();
		homep.clickOnLogoutButton();
		

	}

}

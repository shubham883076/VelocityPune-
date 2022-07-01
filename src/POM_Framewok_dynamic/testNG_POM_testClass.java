package POM_Framewok_dynamic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_POM_testClass {
 
	zerodha_loginpage login;
	zerodha_pinpage pin;
	zerodha_homepage home;
	WebDriver driver; 
    Sheet mySheet;
   
	@BeforeClass 
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{  
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
//	    driver= new ChromeDriver();
	    
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\New folder\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	    driver= new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("lauching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login= new zerodha_loginpage(driver);
		home= new zerodha_homepage(driver); 
		pin= new zerodha_pinpage(driver);
		File MyFile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
        mySheet= WorkbookFactory.create(MyFile).getSheet("kitezerodha");
	}
	
	@BeforeMethod
	public void loginToKite()
	{  
		login.sendusername(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Username", true);
		
		login.sendpassword(mySheet.getRow(1).getCell(1).getStringCellValue());
		Reporter.log("Sending Password",true);
		
		login.clickloginbutton(); 
		Reporter.log("Clicking on login button",true);
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
	
	    pin.senduserpin(mySheet.getRow(2).getCell(1).getStringCellValue()); 
	    Reporter.log("Sending PIN",true);
	    
	    pin.clickcontinuebutton();
	    Reporter.log("Clicking on continue button",true);
	}
	
	@Test
	public void verifyKiteUserName()
	{  
		// expected uSernAMe--> excell  //actual userNAme???  
		
		String expectedUserID = mySheet.getRow(0).getCell(1).getStringCellValue(); 
		String actualUserID = home.actualUserID(expectedUserID);
		Reporter.log("Validating user ID ",true);
		Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
		Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", true); 
	}
	
	@AfterMethod 
	public void logOutFromKiteApp() throws InterruptedException
	{ 	
	 home.clickonprofile();
	 home.clickOnLogoutButton(); 
	 Reporter.log("Logging out.......",true); 
	 }
	
	@AfterClass
	public void closeBrowser()
	{ 
	  driver.close();
	  Reporter.log("closing browser", true); 
    } 
	
}

package Kite_App_TestClass;

import java.io.IOException;


import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Kite_App_Base_Class.Base_class;
import Kite_App_POM_class.zerodha_homepage;
import Kite_App_POM_class.zerodha_loginpage;
import Kite_App_POM_class.zerodha_pinpage;
import Kite_App_Utility.Utility_class;

public class kite_userid_validate extends Base_class {

	zerodha_loginpage login;
	zerodha_pinpage pinnum;
	zerodha_homepage home;
	
	@BeforeClass
	public void launchBrowser()
	{   
		openBrowser();
		login=new zerodha_loginpage(driver);
		pinnum= new zerodha_pinpage(driver);
		home= new zerodha_homepage(driver);  
	}   
	
	 @BeforeMethod 
	 public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	 {  
		 login.sendusername(Utility_class.readDataFormExcel(0, 1));
		 Reporter.log("Sending Username", true);
         login.sendpassword(Utility_class.readDataFormExcel(1, 1)); 
 		 Reporter.log("Sending Password",true);
         login.clickloginbutton();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000)); 
         pinnum.senduserpin(Utility_class.readDataFormExcel(2,1));
         Reporter.log("Sending PIN",true);
         pinnum.clickcontinuebutton(); 
         Reporter.log("Clicking on continue button",true);
     }  
	 
	 @Test 
	 public void validateUserName() throws EncryptedDocumentException, IOException
	 {  
		
		 String actualUserName1 = home.getactualUserID();
		 String expectedUserName= Utility_class.readDataFormExcel(0, 1)  ;
		 Assert.assertEquals(actualUserName1, expectedUserName,"TC is FAILED actual and expected user names not matching"); 
		 Reporter.log("User names are matching TC is passed", true); 
		 Utility_class.takeScreenshot(driver);
	 }   
	 
	 @AfterMethod 
	 public void logoutfromKiteApp() throws InterruptedException
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

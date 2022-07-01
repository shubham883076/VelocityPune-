package Kite_App_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Kite_App_Base_Class.BaseClass_property_Listener;
import Kite_App_POM_class.zerodha_homepage;
import Kite_App_POM_class.zerodha_loginpage;
import Kite_App_POM_class.zerodha_pinpage;
import Kite_App_Utility.Utility_with_property_class;

@Listeners(test_NG_Listener.Listeners.class)

public class KiteTest_Prooerty_Listener extends BaseClass_property_Listener {
	
	zerodha_loginpage login;
	zerodha_pinpage pinnum;
	zerodha_homepage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{   
		openBrowser();
		login=new zerodha_loginpage(driver);
		pinnum= new zerodha_pinpage(driver);
		home= new zerodha_homepage(driver);  
	}   

	@BeforeMethod 
	 public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	 {  
		 login.sendusername(Utility_with_property_class.readDataFromProprty("UN"));
		 Reporter.log("Sending Username", true);
         login.sendpassword(Utility_with_property_class.readDataFromProprty("PWD")); 
 		 Reporter.log("Sending Password",true);
         login.clickloginbutton();
         Utility_with_property_class.implicitWait(driver, 9000);
      
         pinnum.senduserpin(Utility_with_property_class.readDataFromProprty("PIN"));
         Reporter.log("Sending PIN",true);
         pinnum.clickcontinuebutton(); 
         Reporter.log("Clicking on continue button",true);
         Utility_with_property_class.implicitWait(driver, 9000);
     }  
	 
	 @Test 
	 public void validateUserName() throws EncryptedDocumentException, IOException
	 {  
		 Utility_with_property_class.implicitWait(driver, 9000);
		 String actualUserName1 = home.getactualUserID();
		 String expectedUserName=Utility_with_property_class.readDataFromProprty("UN1");
		 Assert.assertEquals(actualUserName1, expectedUserName,"TC is FAILED actual and expected user names not matching"); 
		 Reporter.log("User names are matching TC is passed", true); 
		 Utility_with_property_class.implicitWait(driver, 9000);
		
	 }   
	 
	 @AfterMethod 
	 public void logoutfromKiteApp() throws InterruptedException
	 {   
		 Utility_with_property_class.implicitWait(driver, 9000);
		 home.clickonprofile();
		 home.clickOnLogoutButton();
		 Reporter.log("Logging out.......",true); 
	 }  
	 
	 @AfterClass 
	 public void closeBrowser()
	 {  
		 Utility_with_property_class.implicitWait(driver, 9000);
		 driver.close();
		 Reporter.log("closing browser", true); 
	 } 

}

package test_NG_kite_Assignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class K_TestClass extends K_BaseClass {
 
	K_POM_class login;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{   
		openBrowser();
		login=new K_POM_class(driver);
	}
	
	@BeforeMethod 
	 public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	 {  
		 login.sendusername(K_utility_class.readDataFromProprty("UN"));
		 Reporter.log("Sending Username", true);
        login.sendpassword(K_utility_class.readDataFromProprty("PdWD")); 
		 Reporter.log("Sending Password",true);
        login.clickloginbutton();
        Reporter.log("Clicking on continue button",true);
       
	 }
	
	@Test
	public void mytest()
	{
		
	}
}

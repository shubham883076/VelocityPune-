package test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_study_3 {
 
	 @Test
	  public void thirdtest() 
	  {
		  Reporter.log("Test Method 3 is running", true);  
	  }
	 
	  @Test
	  public void fourthtest()
	  {    
		  Reporter.log("Test Method 4 is running", true);
	  } 
	  
	  @BeforeMethod   
	  public void logIn() 
	  {    
		  Reporter.log("Before method is running", true);
		  }        
	  @AfterMethod 
	  public void logOut()
	  {    
	Reporter.log("After method is running", true);

	}   
	  @BeforeClass  
	  public void launchBrowser() 
	  {   
		  Reporter.log("Before class is running", true); 
		  } 
	  @AfterClass 
	  public void closeBrowser()
	  {   
	 Reporter.log("After class is running", true); 
	 }
	
	
	
}

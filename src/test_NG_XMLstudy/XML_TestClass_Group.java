package test_NG_XMLstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class XML_TestClass_Group {

	@Test (groups="sanity")
	public void firstmethod() 
	{   
		Reporter.log("Method 2 is Running",true);	
	}  
	
	@Test  (groups="regression")
	public void secondmethod()
	{
		Reporter.log("Method 4 is Running",true); 
	}  
	
	@Test (groups="regression") 
	public void thirdmethod() 
	{  
		Reporter.log("Method 5 is Running",true); 
	}  
	
	@Test   (groups="sanity")
	public void fourthmethod() 
	{    
		Reporter.log("Method 3 is Running",true);
	}
	
	@Test   
	public void fifthmethod() 
	{     
		Reporter.log("Method 1 is Running",true);  
	}   
	
	
	
}

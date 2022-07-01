package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_keywords {
  
	@Test(timeOut = 1000) 
	public void C() throws InterruptedException
	{  
		Thread.sleep(20);
		Reporter.log("C is running", true); 	
	}
	
	@Test public void D()
	{   
		Reporter.log("D is running", true);   
	}   
	
	@Test  
	public void A()  
	{     
		Reporter.log("A is running", true);	
	}   
	
	@Test
	public void B()
	{     
		Reporter.log("B is running", true);
	} 
	
	
}

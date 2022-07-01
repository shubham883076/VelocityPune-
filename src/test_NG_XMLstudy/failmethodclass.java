package test_NG_XMLstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failmethodclass {
	
	@Test   
	public void Method6()
    {   
	  
       Reporter.log("Method 6 is Running",true); 
    } 
    
    @Test  
    public void Method7()
    {   
    	 
       Reporter.log("Method 7 is Running",true);	
    } 
    
    @Test  
    public void Method8()  
    {    
	    Reporter.log("Method 8 is Running",true);  
    } 
    
    @Test  
    public void Method9()
    {    
	   Reporter.log("Method 9 is Running",true);  
    } 
    
    @Test  
    public void Method10() 
    {  
    	Assert.fail();
	   Reporter.log("Method 10 is Running",true);   
    }
}

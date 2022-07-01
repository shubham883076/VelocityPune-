package test_NG_XMLstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class XML_testClass2_Group {
	
	@Test   (groups="regression")
	public void Method6()
    {   
       Reporter.log("Method 7 is Running",true); 
    } 
    
    @Test  (groups="sanity")
    public void Method7()
    {   
       Reporter.log("Method 8 is Running",true);	
    } 
    
    @Test  
    public void Method8()  
    {    
	    Reporter.log("Method 9 is Running",true);  
    } 
    
    @Test  
    public void Method9()
    {    
	   Reporter.log("Method 10 is Running",true);  
    } 
    
    @Test  
    public void Method10() 
    {  
	   Reporter.log("Method 6 is Running",true);   
    }
}

package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount_keywords {
  
  @Test(invocationCount = 3)
  public void myMethod()
  {
	  Reporter.log("my Method is Running",true);
  }
  
  
  @AfterMethod
  public void close()
  { 
	  Reporter.log("Closing browser", true);
  } 
  
  @BeforeMethod
  public void open()
  {
	  Reporter.log("open browser ", true);
  }
  
}

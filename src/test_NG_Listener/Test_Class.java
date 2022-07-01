package test_NG_Listener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test_NG_Listener.Class_Listener.class)
public class Test_Class {
 
	  @Test
	  public void myTest()
	  {
         // Assert.fail(); 
		  Reporter.log("hi i m shubham", true);
	  }
	  
	  @Test     //  (dependsOnMethods = {"myTest"}) 
	  public void myMethod() 
	  {  
		  //Assert.fail();
		  Reporter.log("Hi GM",true); 
	  }
}

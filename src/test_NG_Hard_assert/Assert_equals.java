package test_NG_Hard_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
  @Test
  public void myTC() {
	  
	  String s="Velocity";
	  String m="Velocity";
	  String n="Pune";
	  
	  // if s and are same then TC should be passed else TC failed 
	  
	     Assert.assertEquals(m , s,"Strings are not Matching TC is failed");
	     Reporter.log("Strings are matching TC is Passed", true);
	     
	     
	     Assert.assertNotEquals(n , m,"Strings are matching TC is failed");
	     Reporter.log("Strings are not matching TC is PASSED", true);   
  }
}

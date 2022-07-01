package test_NG_Hard_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_nullnotnull {
  @Test
  public void myTC() {
	  
	  String s=null;
	  String m="hi";
	  
	  Assert.assertNotNull(m, "value is Null TC is failed");  
	  Reporter.log("value is not null TC is PASSED",true);
	  
	 // Assert.fail();
	  
	  Assert.assertNull(s, "value is not Null TC failed"); 
	  Reporter.log("value is null TC is passed",true); 
	  
  }
}

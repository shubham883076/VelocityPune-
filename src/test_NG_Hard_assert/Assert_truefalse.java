package test_NG_Hard_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_truefalse {
  @Test
  public void mymethod() {
	  
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(a, " value is false TC is faild");
	  Reporter.log("value is true TC is PASSED", true);
	  
	  
	  Assert.assertFalse(b, "value is true TC is failed");
	  Reporter.log("value is false TC is PASSED",true); 
	  
  }
}

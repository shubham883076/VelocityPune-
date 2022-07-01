package test_NG_Listener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test_NG_Listener.Class_Listener.class)
public class Mumbai_City {
	
	 @Test 
	 public void Sanpada()
	 { 
		 Reporter.log("Sanpada TC is running", true); 
	 }
	 
	 @Test 
	 public void ghanSoli()
	 { 
		 Reporter.log("ghanSoli TC is running", true); 
	 } 

}

package test_NG_Listener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test_NG_Listener.Class_Listener.class)
public class Pune_City {
	
	 @Test
	 public void Swargate()
	 { 
		   //Assert.fail();
		   Reporter.log("Swargate TC is running", true);    
	 }    
	 
	 @Test                    //(dependsOnMethods= {"Swargate"})
	 public void shivajiNagar()
	 {    
		 Reporter.log("shivajiNagar TC is running", true); 
	 } 

}

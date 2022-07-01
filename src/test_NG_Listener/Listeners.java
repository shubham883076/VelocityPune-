package test_NG_Listener;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import Kite_App_TestClass.KiteTest_Prooerty_Listener;

public class Listeners  implements ITestListener {
	
	KiteTest_Prooerty_Listener bs=new KiteTest_Prooerty_Listener();       //created object of base class
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		String TCname = result.getName();
		try {
			bs.takeScreenshot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("TC is failed, screenshot taken",true);
		Reporter.log("failed TC name is " +result.getName(),true);
	} 
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{ 
		Reporter.log("TC is sucessful",true); 
		ITestListener.super.onTestSuccess(result);
		Reporter.log("pass TC name is " +result.getName(),true);
	} 
	 
	 @Override 
	 public void onTestSkipped(ITestResult result)
	 {
		 Reporter.log("TC is skipped, please check dependent TC",true); 
		 ITestListener.super.onTestSkipped(result);
		 Reporter.log("skipped TC name is " +result.getName(),true);
	 } 
	
}

package test_NG_Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Class_Listener  implements ITestListener  {
 
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is failed, screenshot taken",true);
		ITestListener.super.onTestFailure(result);
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

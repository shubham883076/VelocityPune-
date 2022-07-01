package Kite_App_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility_with_property_class { 
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{  
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		String random=RandomString.make(6); 
        File dest= new File("D:\\5MarchClassNotes\\SELENIUM Files\\Screenshots\\KITEscreenshots"+random+".png");  
        FileHandler.copy(src, dest); 
	} 
	
	public static String readDataFromProprty (String key)     throws IOException
	{
		Properties prop= new Properties();
		FileInputStream myprop= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SeleniumPractice\\src\\shubhaml_data.Properties");
		
		prop.load(myprop);
		
		String value = prop.getProperty(key);
		
		return value;
		
	} 
	
	 public static void implicitWait (WebDriver driver,int timeUnit )
	 {  
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	 }
	 
	
}

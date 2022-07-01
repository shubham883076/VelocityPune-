package Kite_App_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class UtilityClass_proprty_Listener {
	
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

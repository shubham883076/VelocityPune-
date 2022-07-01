package Kite_App_Base_Class;
import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import Kite_App_Utility.Utility_with_property_class;

public class Base_class_with_property {
	
	 protected  WebDriver driver;
		
	 public void openBrowser() throws IOException              //browser setup 
	 { 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe"); 
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get(Utility_with_property_class.readDataFromProprty("URL"));
         Reporter.log("lauching url",true);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 
	 }
	 


}

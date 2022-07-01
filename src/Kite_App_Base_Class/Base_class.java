package Kite_App_Base_Class;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base_class {
	
	 protected WebDriver driver;
	
	 public void openBrowser()              //browser setup 
	 { 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe"); 
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
         driver.get("https://kite.zerodha.com/");
         Reporter.log("lauching url",true);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 
	 }
}

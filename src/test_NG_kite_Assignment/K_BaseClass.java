package test_NG_kite_Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class K_BaseClass {
	
	protected WebDriver driver;
	
	 public void openBrowser() throws IOException              //browser setup 
	 { 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe"); 
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get(K_utility_class.readDataFromProprty("URL"));
        Reporter.log("lauching url",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	 }

}

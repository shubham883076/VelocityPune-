package Shreenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shreenshot_Study {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();	
			
		 driver.navigate().to("https://demoqa.com/select-menu");
		 Thread.sleep(1000);
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\5MarchClassNotes\\SELENIUM Files\\Screenshots\\screenshot.png");
		
//		>> To store screenshot in local drive (desired location ), we need to call a method 
//		>> i-e. copy file () which is present inside fileHandler class.
//		>> FileHandler.copy (src, newfile("destinati path"));

		FileHandler.copy(source, destination);
		
	}

}
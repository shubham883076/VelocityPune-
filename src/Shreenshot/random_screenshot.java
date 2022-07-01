package Shreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class random_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/select-menu");
		 Thread.sleep(100);
		 
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
		String ran=RandomString.make(4);
		
		File dest=new File("D:\\5MarchClassNotes\\SELENIUM Files\\Screenshots\\screenshots"+ran+".png");
		
		FileHandler.copy(source, dest);
		
		
		

	}

}

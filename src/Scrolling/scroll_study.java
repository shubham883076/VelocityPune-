package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_study {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
			
	    driver.navigate().to("https://vctcpune.com/");
		 
	    JavascriptExecutor j= ((JavascriptExecutor)driver);
		 
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-900)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,5000)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-500)");

		
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
	    // -ve x value--> left hand side, Y value -ve --> up 
	}

}

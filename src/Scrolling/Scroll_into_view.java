package Scrolling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_into_view {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
			
	    driver.navigate().to("https://vctcpune.com/");
		 
	   WebElement viewtext = driver.findElement(By.xpath("//strong[text()='Viman Nagar Branch']"));

	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  js.executeScript("window.scrollBy(90,900)");
	  js.executeScript("arguments[0].scrollIntoView(true)",viewtext);

	  
	  
	  
	}

}

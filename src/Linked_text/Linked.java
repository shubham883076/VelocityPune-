package Linked_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	
     driver.get("https://www.cricbuzz.com/");
     Thread.sleep(200);
		
     driver.findElement(By.linkText("RCB vs CSK - RCB Won")).click();
	 Thread.sleep(500);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}

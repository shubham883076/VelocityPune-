package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsWithText {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/python/default.asp");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(500);
	    
	    //xpath by contains with text
	    
	    driver.findElement(By.xpath("//p[contains(text(),'create web applications.')]"));
		
		
		
		
		

	}

}

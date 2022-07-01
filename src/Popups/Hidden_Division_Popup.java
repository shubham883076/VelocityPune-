package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();	
		    
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(100);
		    
		    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shubham");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    System.out.println("pop-up handled successfully");
		    Thread.sleep(100);
		
		    driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("redmi note 11 pro");
		    Thread.sleep(100);
		    
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
	
	}

}

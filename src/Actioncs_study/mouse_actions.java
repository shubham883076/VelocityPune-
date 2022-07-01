package Actioncs_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");   
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
		 
		 //move to element using mouse actions   
		 Actions act= new Actions(driver);   
		 WebElement MyElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));   
		 act.moveToElement(MyElement).perform();  
		 
		 //click & double click using mouse actions      
		 WebElement testElement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));   
		 //1st way   
		 act.moveToElement(testElement).perform();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
		 
		 //1st
		 act.click().perform();  
		 //2nd   
     	 act.moveToElement(testElement).click().build().perform();      
		 //3rd       
		 act.click(testElement).perform();
		 
//		 act.doubleClick(testElement);
		 
		 //right click--context click
		 
		 WebElement testElement2 = driver.findElement(By.xpath("//div[@class='row topper']"));
		 
		 act.moveToElement(testElement2).contextClick().build().perform();      
		 act.contextClick(testElement2).perform(); 
		
		
		

	}

}

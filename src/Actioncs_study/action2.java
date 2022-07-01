package Actioncs_study;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");   
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
		 

//        WebElement myElement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));      
          
//        act.doubleClick(myElement).perform(); 
//        
        //drag and drop 
        
        WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        
        WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        
        Actions act= new Actions(driver);  
        act.dragAndDrop(source, destination).perform();
        
        
        
        
                   
        
        
        
        
        
        
//        Alert alt = driver.switchTo().alert();      
//        alt.accept(); 
	}

}

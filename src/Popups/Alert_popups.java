package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();	
	    
	    driver.get("https://demoqa.com/alerts");
	    Thread.sleep(100);

	    driver.findElement(By.xpath("//button[@id='alertButton']")).click(); 
	    Thread.sleep(1000); 
	    
//	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();   
//	    driver.findElement(By.xpath("(//div[@class='header-text'])[1]")).click();
//      org.openqa.selenium.UnhandledAlertException
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click(); 
		Thread.sleep(1000); 
		alt.accept(); 
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click(); 
		Thread.sleep(1000); 
		alt.getText();
		System.out.println(alt.getText());
		alt.dismiss();

	}

}

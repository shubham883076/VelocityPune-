package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_brouser_popups {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();	
	    
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(5000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(5000);
		
		Set<String> IdOfAllwindow = driver.getWindowHandles();
		ArrayList<String> all= new  ArrayList<>(IdOfAllwindow);
	    String allbrowser = all.get(1);
	    
		driver.switchTo().window(allbrowser);           //switch selenium focus from main page to child browser
		driver.findElement(By.xpath("//a[@itemprop='item']")).click();
		Thread.sleep(100);
		
		driver.switchTo().window(all.get(0));           //switch selenium focus from child page to main browser
		driver.findElement(By.name("NewTab")).click();
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/python/default.asp");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(500);
	    
	    //xpath by text
	    
	    driver.findElement(By.xpath("//h2[text()='Learn Python']"));
		
		driver.findElement(By.xpath("//p[text()='Python can be used on a server to create web applications.']"));
	}

}

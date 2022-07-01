package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class X_Path_locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(120);
		
		//xpath locator by attribute
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		  
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

}

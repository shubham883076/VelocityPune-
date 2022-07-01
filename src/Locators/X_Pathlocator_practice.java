package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Pathlocator_practice {


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		Thread.sleep(500);

	}

}

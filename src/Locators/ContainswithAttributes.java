package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainswithAttributes {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/python/default.asp");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(500);
	    
	    //xpath by contains with attributes
		
		driver.findElement(By.xpath("//a[contains(@title,'SQL Tutorial')]"));
		
		
	}

}

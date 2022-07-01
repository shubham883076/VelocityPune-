package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class peactice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
    
	WebDriver  driver=new ChromeDriver();
   
    driver.get("https://www.cricbuzz.com/");
	
	driver.findElement(By.xpath("//span[@class='cb-plus-ico cb-user-icon']")).click();
	
	
	}

}

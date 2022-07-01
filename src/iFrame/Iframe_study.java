package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();	
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(500);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(50);
		
	}

}

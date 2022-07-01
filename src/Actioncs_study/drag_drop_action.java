package Actioncs_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class drag_drop_action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest1 = driver.findElement(By.xpath("//ol[@id='bank'] "));
		
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest2 = driver.findElement(By.xpath("//ol[@id='amt7'] "));
		
	
		Actions a=new Actions(driver);
		
		a.dragAndDrop(source1, dest1).perform();
		Thread.sleep(200);
		a.dragAndDrop(source2, dest2).perform();
		System.out.println("webelement successfully drag and drop");
		
		WebElement account = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[5]"));
		a.moveToElement(account).doubleClick().perform();
		System.out.println("webelement successfully double clicked");
		a.contextClick().perform();
		System.out.println("on webelement successfully right clicked");
	}

}

package Scrolling;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_view {
	
	public static void main(String[] args) throws InterruptedException  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("vctcpune.com");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.findElement(By.xpath("//h3[text()='Velocity | Best software testing centre in Pune and Mumbai']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement name = driver.findElement(By.id("opentab"));
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(80,200)");
        Thread.sleep(500);
     	jse.executeScript("arguments[0].scrollIntoView(true)", name);
     	
		
}
}
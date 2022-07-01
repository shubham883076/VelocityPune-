package Scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		System.out.println(driver.manage().window().getSize());
		
//		To set size--> use Dimension class and create object of Dimension class
		
		Dimension d=new Dimension(1000,600);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
	}

}

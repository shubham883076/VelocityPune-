package Scrolling;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		System.out.println(driver.manage().window().getPosition());
		
//	    To set Position--> use Point class and create object of Point class
		
		Point p=new Point(200,200);
		
		driver.manage().window().setPosition(p);
		
		
	}

}

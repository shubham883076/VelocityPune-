package Actioncs_study;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 WebElement textbox = driver.findElement(By.id("autocomplete"));
		 
//		 textbox.sendKeys("Shubham Landge");
		 
		 Actions act=new Actions(driver);
		 
//		 act.sendKeys(textbox,"Shubham Landge").perform();
		 
//act.keyDown(textbox,Keys.SHIFT).sendKeys("shUbhaM").keyUp(Keys.SHIFT).sendKeys("LANDGE").build().perform();	
	
//act.keyDown(textbox,Keys.SHIFT).sendKeys("shubhamlandge").perform();

		 act.keyUp(textbox, Keys.SHIFT).sendKeys("shubhamLANDGE").perform();

	}

}

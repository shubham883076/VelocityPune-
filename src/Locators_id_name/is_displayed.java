package Locators_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        WebElement display = driver.findElement(By.name("show-hide"));
        
        boolean result = display.isDisplayed();
        System.out.println("textbox is displayed is "+result);
        
        display.sendKeys("hi i am shubham");
        Thread.sleep(1000);
        
        driver.findElement(By.id("hide-textbox")).click();
       
        boolean result2 = display.isDisplayed();
        System.out.println("textbox is displayed is "+result2);
        
        

 }

}

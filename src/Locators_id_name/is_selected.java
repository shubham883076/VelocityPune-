package Locators_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
        
        if (checkbox.isSelected())
        {
        	System.out.println("textbox is selected is"+checkbox.isSelected());
        }
        else
        {
        	checkbox.click();
        	Thread.sleep(100);
        	System.out.println("textbox is selected is a "+checkbox.isSelected());
        }
          
  }

}

package Locators_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_gettext {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        
        WebElement text = driver.findElement(By.xpath("//span[text()='Motivating & Inspiring Staff']"));
        System.out.println(text.getText());
        
        String actualtext = text.getText();
        String exceptedtext = "Motivating & Inspiring Staff";
        	
        if(actualtext.equals(exceptedtext)) 
        {
        	System.out.println("text value is correct");
        }
        else
            {
        	System.out.println("text value is not correct");
            }  
      WebElement text2=driver.findElement(By.xpath("//p[text()='Click the below button to start slenium practice.']"));
      System.out.println(text2.getText());  
      
      String actual1 = "Click the below button to start slenium practice.";
      String excepted2 = "click the below button to start slenium practice.";
      
      if(actual1.equals(excepted2))
      {
	    System.out.println("text2 value is correct");
      }
      else
      {
	  System.out.println("text2 value is not correct");
      }
   
}
}

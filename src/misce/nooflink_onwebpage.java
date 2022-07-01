package misce;

import java.time.Duration;

import java.util.Iterator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflink_onwebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		
	        	System.out.println(links.size());
		        System.out.println(links.get(4).getText());
		        System.out.println("========================");
		  
       Iterator<WebElement> linklist = links.iterator();
       while(linklist.hasNext())
       {
    	System.out.println(linklist.next().getText());   
       }
		
//		for(int i=0;i<=links.size()-1;i++)
//		{
//	
//			System.out.println(links.get(i).getText());
//		}
		

//		for(WebElement osr:links)
//		{
//			System.out.println(osr.getText());
//		}
		
		driver.close();
	}
}

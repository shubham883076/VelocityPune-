package misce;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noof_brokenlinks {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
        //print the number of links collected
        System.out.println("No of links are "+ links.size());

        //verify if the href is not null
        //if not null, then get the http status code and message
        for (WebElement link : links)
          {
            String url = link.getAttribute("href");
            
            if (!url.isEmpty()) 
            {
                verifyLinks(url);
            }
          }
        Thread.sleep(2000);
        driver.quit();
	
	}

	private static void verifyLinks(String link) {
		
		 try
	        {
				//create URL connection for each link and get the response
	            HttpURLConnection httpURLConnect=(HttpURLConnection) new URL(link).openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            String Message = httpURLConnect.getResponseMessage();
	            int status = httpURLConnect.getResponseCode();

	            if(status!=200)
	            {
	                System.out.println(link + " - is broken - " +
	                        status + " " + Message);
	            }
	            else
	            {
	                System.out.println(link + " - is working fine - " + status + " " + Message);
	                        
	            }
	        }
		 
		 catch (Exception e) 
		 {
	            System.out.println("can't verify the links " + e.getMessage());
	     }
		
}
}



	
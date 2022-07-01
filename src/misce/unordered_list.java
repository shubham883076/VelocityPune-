package misce;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unordered_list {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  //Hidden division poupups
		
		driver.findElement(By.name("q")).sendKeys("Redmi Note 11 pro");
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]"));
		System.out.println(reviews.getText());
		
		WebElement ratings = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]"));
		System.out.println(ratings.getText());
		
		List<WebElement> info = driver.findElements(By.xpath("(//div[@class='_3pLy-c row'])[1]/div"));
		
        for(WebElement mobile:info)
        {
    	   System.out.println(mobile.getText());
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ratings.click();
		
	}

}

package misce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorder123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement search:searchResults)
		{
			System.out.println(search.getText());
			
		}
		
		String exectedResult = "honda amaze";
		
		for(WebElement results:searchResults)
		{
			//System.out.println(results.getText());
			String actualResult = results.getText();       //honda
			
			if(actualResult.equals(exectedResult))
			{
				results.click();
				break;
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	//	driver.findElement(By.linkText("Images")).click();
		
		driver.findElement(By.partialLinkText("Ima")).click();

	}

}

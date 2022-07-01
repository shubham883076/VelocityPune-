package wait_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);             >>> syntax before selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));      //>>> syntax after selenium 4
		
		driver.navigate().to("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
		
	}

}

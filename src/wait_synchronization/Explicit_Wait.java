package wait_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));   // >>>> implicit wait
		
		WebElement about = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		about.click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(1000));   //  >>>new syntax
		
//		WebDriverWait w1=new WebDriverWait(driver, 10);   >>> old syntax
		
		w.until(ExpectedConditions.visibilityOf(about));
//		
		
		
		

	}

}

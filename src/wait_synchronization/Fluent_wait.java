package wait_synchronization;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//WebElement about = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		
		//Wait<WebDriver> wait =new Wait<WebDriver>(driver)
		
		
		
		
		
		
		

	}

}

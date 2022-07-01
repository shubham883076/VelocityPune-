package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	    Thread.sleep(1500);
		
		driver.findElement(By.xpath("//h1[text()='Practice Page']")).click();

		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("abcdefghijkl");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shubham");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		driver.manage().window().minimize();
	}

}

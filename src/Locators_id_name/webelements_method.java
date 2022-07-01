package Locators_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements_method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.discoveryplus.in/home");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
	    WebElement otpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
	    boolean result = otpbutton.isEnabled();
	    System.out.println("otp button enable is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8888151515");
		Thread.sleep(1000);
		
		boolean result1 = otpbutton.isEnabled();
        System.out.println("otp button enable is "+result1);
        
        
	}

}

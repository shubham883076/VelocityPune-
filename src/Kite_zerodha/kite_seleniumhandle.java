package Kite_zerodha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_seleniumhandle {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
			WebElement usreid = driver.findElement(By.id("userid"));
			WebElement password = driver.findElement(By.id("password"));
		    WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		    usreid.sendKeys("ELR321");
		    password.sendKeys("Dhana1111");
		    loginbutton.click();
		    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		    
		   WebElement pin = driver.findElement(By.id("pin"));
		   WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		   pin.sendKeys("982278");
		   continuebutton.click();
		   driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

		   WebElement usercode = driver.findElement(By.xpath("//span[@class='user-id']"));
		   String actualtext = usercode.getText();
		   String execeptedtext = "ELR321";
		    if(actualtext.equals(execeptedtext))
		   {
			   System.out.println("test case pass");
		   }
		   else
		   {
			   System.out.println("test case fail");
		   }
		    usercode.click();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		    logout.click();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
            driver.close();
}
}

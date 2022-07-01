package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_vctc {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();	
			
		 driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(1000);
		 
		 WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 
		 Select s =new Select(dropdown);
		 s.selectByVisibleText("Option3");
		 Thread.sleep(1000);
		 s.selectByValue("option1");
		 Thread.sleep(1000);
		 s.selectByIndex(3);
		 Thread.sleep(1000);
		 s.selectByVisibleText("Select");
		 Thread.sleep(1000);
		 
		 
		 
	     WebElement dropd2 = driver.findElement(By.xpath("//input[@list='mah-district']"));
	     Select sb =new Select(dropd2);
	     sb.selectByVisibleText("Amravati");
	     
	     
	}

}

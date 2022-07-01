package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();	
			
		 driver.navigate().to("https://demoqa.com/select-menu");
		 Thread.sleep(1000);
		 
		 WebElement muilti_list = driver.findElement(By.id("cars"));
		 Thread.sleep(1000);
		 
		 Select s21=new Select(muilti_list);
		 for(int i=0;i<=3;i++)
		   {
		       Thread.sleep(100);
		       s21.selectByIndex(i);
		       System.out.println(s21.getAllSelectedOptions().get(i).getText());
		   }
		boolean result = s21.isMultiple();
		System.out.println(result);
		
		System.out.println(s21.getFirstSelectedOption().getText());
		
		System.out.println(s21.getAllSelectedOptions().get(2).getText());
		
		
	}

}

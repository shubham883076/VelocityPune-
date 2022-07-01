package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selected {

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
	   }
	boolean result = s21.isMultiple();
	System.out.println("multiple selection result is "+result);
	
	System.out.println(s21.getFirstSelectedOption().getText());
	

	
	for(int i=0;i<=3;i++)
		{
		System.out.println(s21.getOptions().get(i).getText());
		}
	/////////////////////
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
	Thread.sleep(6000);
	WebElement daylist= driver.findElement(By.name("birthday_day"));	
	  
	Select date=new Select(daylist);
	for(int i=30;i>=0;i--)	
	{
		Thread.sleep(500);
		date.selectByIndex(i);
	}
	boolean res = date.isMultiple();	
	System.out.println("date is multiple selected is "+res);
	Thread.sleep(200);
	
	
	System.out.println(date.getFirstSelectedOption().getText());
	System.out.println(date.getAllSelectedOptions().size());
	for(int i=0;i<=date.getAllSelectedOptions().size()-1;i++)
	{
		Thread.sleep(10);
		date.getAllSelectedOptions().get(i).getText();
		System.out.println(date.getAllSelectedOptions().get(i).getText());
	}
	
	
	
  }
}

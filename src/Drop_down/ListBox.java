package Drop_down;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ListBox {
   public static void main(String[] args) throws InterruptedException {
	   
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Thread.sleep(1000);
			
		Select s=new Select(day);
		s.selectByVisibleText("8");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		
		Select s1=new Select(month);
		s1.selectByValue("7");
		Thread.sleep(1000);

		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		
        Select s2=new Select(year);
        
        for(int i=0;i<=8;i++)
        {
    		Thread.sleep(500);
            s2.selectByIndex(i);
            System.out.println(s2.getOptions().get(i).getText());
        }
        
       boolean result3 = s2.isMultiple();
       System.out.println("year is multiple selected is "+result3);
       System.out.println("===========================================================================");
       for(int i=0;i<=27;i++)
       {
    	  s2.getOptions().get(i).getText();
    	 
    	  System.out.println(s2.getOptions().get(i).getText());
       }
  }

}

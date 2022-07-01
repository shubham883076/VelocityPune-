package web_table;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_element {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr"));
			List<WebElement> coloums = driver.findElements(By.xpath("//th"));
			
			int totalrows = rows.size();
			int totalcoloums = coloums.size();
			System.out.println(""+totalrows);
			System.out.println(""+totalcoloums);
		
			List<WebElement> third = driver.findElements(By.xpath("//table//tr[3]"));
			for(WebElement tss:third)
			{
				System.out.println(tss.getText()+" >> ");
			}
			System.out.println("==============================================");
			Iterator<WebElement> thirdrow = third.iterator();
			
			while(thirdrow.hasNext())
					{
				System.out.println(thirdrow.next().getText()+" || ");
					}
			
			System.out.println("=================================================");
			
			for(int i=1;i<=totalrows;i++)
			{
				for(int j=1;j<=totalcoloums;j++)
				{
					if(i==1)
					{
						String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
						System.out.print(text+" ");
					}
					 else { 
						 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText(); 
						 System.out.print(text+" ");
					 }
				}
				System.out.println();
			}
			

	}

}

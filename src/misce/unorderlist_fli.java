package misce;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderlist_fli {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Redmi Note 11 pro");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> searchlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement suggestion:searchlist)
		{
			System.out.println(suggestion.getText());
		}
		
        System.out.println("===================================");
		WebElement search = driver.findElement(By.xpath("((//ul[@class='G43f7e'])[1]//li//div[@class='pcTkSc'])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(search.getText());
		search.click();	
}
}

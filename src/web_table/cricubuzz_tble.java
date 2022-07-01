package web_table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricubuzz_tble {

	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/47605/gt-vs-rr-final-indian-premier-league-202");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		List<WebElement> scoretble = driver.findElements(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']//div[1]//div[1]//span"));
		
		List<WebElement> score = driver.findElements(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']//div[4]//div[4]//div[1]//a"));
		
		scoretble.size();
		score.size();
	}

}

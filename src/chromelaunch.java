import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://vctcpune.com/");
		//driver.close();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.quit();
		driver.navigate().to("https://www.cricbuzz.com/live-cricket-scores");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	
	}

}

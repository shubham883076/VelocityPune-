package POM_Framewok1;
import java.io.IOException;

import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogin_testingClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	Kite_logIn_page login= new Kite_logIn_page(driver);
	login.sendUserName();
	login.sendPassword();
	login.clickOnLoginButton();   
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	Kite_pin_page pinin=new Kite_pin_page(driver);
	pinin.sendpin();
	pinin.continueclick();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	Kite_home_page homep=new Kite_home_page(driver);
	homep.validateUserID();
	homep.clickOnLogoutButton();
	
	driver.close();
		
	}

}

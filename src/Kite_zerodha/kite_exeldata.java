package Kite_zerodha;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_exeldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
			File myfile=new File("C:\\Users\\HP\\Documents\\selenium_exel_file.xlsx");
			Sheet sheet = WorkbookFactory.create(myfile).getSheet("kitezerodha");
			String un = sheet.getRow(0).getCell(1).getStringCellValue();
			String psw = sheet.getRow(1).getCell(1).getStringCellValue();
			String pinn= sheet.getRow(2).getCell(1).getStringCellValue();
			
			WebElement usreid = driver.findElement(By.id("userid"));
			WebElement password = driver.findElement(By.id("password"));
		    WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		    usreid.sendKeys(un);
		    password.sendKeys(psw);
		    loginbutton.click();
		    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		    
		   WebElement pin = driver.findElement(By.id("pin"));
		   WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		   pin.sendKeys(pinn);
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

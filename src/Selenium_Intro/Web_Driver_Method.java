package Selenium_Intro;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Web_Driver_Method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		 
	//	ChromeDriver driver=new ChromeDriver();
		
	//	RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/sql_union.asp");
     
		driver.navigate().to("https://vctcpune.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}

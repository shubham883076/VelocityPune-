package test_NG_Hard_assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class practise_Assert {
  @Test
  public void method1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	  checkBox1.click();
	  
	  Assert.assertTrue(checkBox1.isSelected() , "CheckBox is not Selected TC is faild");
	  Reporter.log("CheckBox is Selected TC is Passed",true);
	  
	  WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
	  textbox.sendKeys("hi");
	  Assert.assertNotNull(textbox, "tc failed");
      Reporter.log(" text box is not null tc is pass",true);
	  
	  
	  
  }
}

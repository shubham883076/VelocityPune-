package Kite_App_POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodha_loginpage {
	
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PASSWORD;
	@FindBy(xpath="//button[@type='submit']") private WebElement LOGINBUTTON;
	
	
	public zerodha_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendusername(String userid)
	{
		UN.sendKeys(userid);
	}
	
	public void sendpassword(String userpsw)
	{
		PASSWORD.sendKeys(userpsw);
		
	}
	
	public void clickloginbutton()
	{
		LOGINBUTTON.click();
	}
	
	

}

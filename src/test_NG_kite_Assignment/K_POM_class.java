package test_NG_kite_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class K_POM_class {
	
	@FindBy(id="userid") private WebElement UNN;
	@FindBy(id="password") private WebElement PASSWORDS;
	@FindBy(xpath="//button[@type='submit']") private WebElement LOGINBUTTONN;
	
	
	public K_POM_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendusername(String userid)
	{
		UNN.sendKeys(userid);
	}
	
	public void sendpassword(String userpsw)
	{
		PASSWORDS.sendKeys(userpsw);
		
	}
	
	public void clickloginbutton()
	{
		LOGINBUTTONN.click();
	}
	
	
	
	
	

}

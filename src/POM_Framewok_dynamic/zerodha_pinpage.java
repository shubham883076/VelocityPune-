package POM_Framewok_dynamic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodha_pinpage {

	@FindBy(id="pin")  private  WebElement PIN ;
	@FindBy(xpath="//button[@class='button-orange wide']")  private WebElement CONTINUEBUTTON;
	
	public zerodha_pinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void senduserpin(String kitepin)
	{
		PIN.sendKeys(kitepin);
	}
	
	public void clickcontinuebutton()
	{
		CONTINUEBUTTON.click();
	}
}

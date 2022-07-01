package POM_Framewok1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_pin_page {
	
	@FindBy (id="pin")    private  WebElement pin1;
	@FindBy (xpath="//button[@class='button-orange wide']")  private    WebElement continuebutton;
	
	public Kite_pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendpin()
	{
		pin1.sendKeys("982278");
	}
	
	public void continueclick()
	{
		continuebutton.click();
	}
	

}

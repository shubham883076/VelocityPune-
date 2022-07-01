package POM_Framewok1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Kite_home_page {

	@FindBy(xpath = "//span[@class='user-id']")  private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")   private  WebElement logOutbutton;
	
	public Kite_home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 public void validateUserID()
	 {    
		String actualUserID = userId.getText();
		String expetctedUserID = "ELR321";
		 
		if(actualUserID.equals(expetctedUserID))
		{    
		 System.out.println("User ID matching TC is Passed");
		}    
		else 
		{     
		 System.out.println("User ID not matching TC is Failed");  
		}	 
	 }
	 
	 public void  clickOnLogoutButton() throws InterruptedException  
	 {  
		 userId.click();   
		 Thread.sleep(200); 
		 logOutbutton.click(); 
	 }  
	 
	 
}
	 

	


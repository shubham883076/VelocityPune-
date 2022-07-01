package POM_Framewok_dynamic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodha_homepage {
	
	@FindBy(xpath = "//span[@class='user-id']")  private WebElement userId;
	@FindBy(xpath = "//span[@class='user-id']")  private WebElement profileclick;
	@FindBy(xpath = "//a[@target='_self']")   private  WebElement logOutbutton;
	
	
	public zerodha_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	 public void validateUserID(String exceptedusername)
	 {    
		String actualUserID = userId.getText();
		String expetctedUserID = exceptedusername;
		 
		if(actualUserID.equals(expetctedUserID))
		{    
		 System.out.println("User ID matching TC is Passed");
		}    
		else 
		{     
		 System.out.println("User ID not matching TC is Failed");  
		}	 
	 }
	
	 public String actualUserID(String expectedUsername) 
	 {    
		 String actualUserID = userId.getText();
		 return actualUserID; 
		 
	 }

    public void clickonprofile()
    {
    	profileclick.click();
    }

	public void clickOnLogoutButton() 
	{
		logOutbutton.click();
		
	}

}

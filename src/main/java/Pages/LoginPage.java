package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.PageUtils;

public class LoginPage extends PageUtils {
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement loginpage;
	
	@FindBy(name="user_name")
	public WebElement usernamelogin ;
	
	@FindBy(name="password")
	public WebElement passwordlogin ;
	
	@FindBy(xpath="//button[@name='mark_attendance']//preceding::button")
	public WebElement loginsubmit ;
	
	public LoginPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(loginpage);
		}
	
	
	public void enterUsername(String text)
	{
		enterText(usernamelogin,text);
	}
	
	public void enterPassword(String text)
	{
		enterText(passwordlogin,text);
	}
	
	public void clickonSignIn()
	{
		clickOnElement(loginsubmit);//sendKeys(Keys.RETURN);
	}
}

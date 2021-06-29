package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class UserDetailsPage extends PageUtils {
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement userpage;
	
	@FindBy(xpath="//a[text()='All Users']")
	public WebElement allusers;
	
	@FindBy(xpath="//input[@type='search'and@class='form-control input-sm']")
	public WebElement searchcolumns;
	
	@FindBy(xpath="//a[text()='Sneha Mathew']")
	public WebElement identifyname;
	
	
	public UserDetailsPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getElementDisplayStatus() 
	{
	validateElementDisplayStatus(userpage);
	}
	
	
	
	public void clickonAllUsers()
	{
		clickOnElement(allusers);
	}
	
	public void enterinSearchColumns(String text)
	{
		enterText(searchcolumns,text);
	}
	
	public void clickonIdentifyName()
	{
		clickOnElement(identifyname);
	}
}

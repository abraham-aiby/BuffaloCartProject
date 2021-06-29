package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class UpdateUserDetailsPage extends PageUtils {
	
WebDriver driver;
	
@FindBy(xpath="")
public WebElement userpage;

@FindBy(xpath="//input[@type='search'and @class='form-control input-sm']")
public WebElement searchcolumns;

@FindBy(xpath="//a[text()='Sneha Mathew']")
public WebElement identifyname;

@FindBy(xpath="//td[@class='old day' and text()='30']")
public WebElement doj;

@FindBy(xpath="//select[@name='gender']")
public WebElement genderddown;

@FindBy(xpath="//th[@class='datepicker-switch' and text()='2021']")
public WebElement dateswitch;

	
@FindBy(xpath="//a[text()='Reset Password']")
public WebElement resetpass;

@FindBy(xpath="//input[@id='change_email_password']")
public WebElement currentpass;

@FindBy(xpath="//input[@id='new_password']")
public WebElement newpass;

@FindBy(xpath="//input[@name='password']")
public WebElement confirmpass;

@FindBy(xpath="//button[@id='new_uses_btn']")
public WebElement updatepass;

@FindBy(xpath="//a[text()='Update']//parent::span[@data-original-title='update_conatct']//parent::div[@class='pull-right']")
public WebElement update;	

	public UpdateUserDetailsPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getElementDisplayStatus() 
	{
	validateElementDisplayStatus(userpage);
	}
	
	public void validatePageWebElements()
	{
		
		validateWebElementsPageStatus(searchcolumns);
		validateWebElementsPageStatus(identifyname);
		validateWebElementsPageStatus(doj);
		validateWebElementsPageStatus(genderddown);
		validateWebElementsPageStatus(dateswitch);
		validateWebElementsPageStatus(currentpass);
		validateWebElementsPageStatus(newpass);
		validateWebElementsPageStatus(confirmpass);
		validateWebElementsPageStatus(updatepass);
		validateWebElementsPageStatus(update);
	
	}
	
	public void searchColumns(String text)
	{
		try {
			WebElement searchcolumns = driver.findElement(By.xpath("//input[@type='search'and @class='form-control input-sm']"));
			
			enterText(searchcolumns,text);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement searchcolumns = driver.findElement(By.xpath("\"//input[@type='search'and @class='form-control input-sm']"));
			enterText(searchcolumns,text);
		}
		
	}
	
	
	public void clickonUser()
	{
		clickOnElement(identifyname);
	}
	
	public void clickonResetPass()
	{
		clickOnElement(resetpass);
	}
	
	public void enterCurrentPass(String text)
	{
		enterText(currentpass,text);
	}

	public void enterNewPass(String text)
	{
		enterText(newpass,text);
	}

	public void enterConfirmPass(String text)
	{
		enterText(confirmpass,text);
	}

	public void clickonUpdatePass()
	{
		clickOnElement(updatepass);
	}

	public void clickonserUpdate()
	{
		clickOnElement(update);
	}
	

}

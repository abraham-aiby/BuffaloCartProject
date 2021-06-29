package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class NewUserPage extends PageUtils{
	
	WebDriver driver;
	
	public NewUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="")
	public WebElement loginpage;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-default']")
	WebElement signup;

	@FindBy(xpath="//input[@name='name']")
	WebElement companyname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement companyemail;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signupInputRePassword1']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(loginpage);
		}
	
	 public void validatePageWebElements()
		{
			
			validateWebElementsPageStatus(signup);
			validateWebElementsPageStatus(companyname);
			validateWebElementsPageStatus(companyemail);
			validateWebElementsPageStatus(username);
			validateWebElementsPageStatus(password);
			validateWebElementsPageStatus(confirmpassword);
			validateWebElementsPageStatus(submit);
		}
	
	public void clickonSignUp()
	{
		
		clickOnElement(signup);
	}
		public void enterCompanyName(String text)
		{
			enterText(companyname,text);
		}
		public void enterCompanyEmail(String text)
		{
			enterText(companyemail,text);
		}
		public void enterCompanyUser(String text)
		{
			enterText(username,text);
		}
		public void enterCompanyPass(String text)
		{
			enterText(password,text);
		}
		public void confirmCompanyPass(String text)
		{
			enterText(confirmpassword,text);
		}
		public void clickSubmit()
		{
			clickOnElement(submit);
		}
		
	}


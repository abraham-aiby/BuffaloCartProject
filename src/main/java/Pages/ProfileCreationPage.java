package Pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.ImageUpload;
import Utils.PageUtils;

public class ProfileCreationPage extends PageUtils {
	
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement userpage;
	
	@FindBy(xpath="//a[text()='New User']")//xpath
    public WebElement newusertext;
	
    @FindBy(name="fullname")
	public WebElement fullname;
    
    
    @FindBy(id="check_employment_id")
    public WebElement employmentid;
	
	
    @FindBy(id="check_username")
    public WebElement username;
	
	
    @FindBy(id="new_password")
    public WebElement password;
	
	
    @FindBy(name="confirm_password")
    public WebElement confirmpassword;
	
	
    @FindBy(id="check_email_addrees")
    public WebElement email;
	
    @FindBy(xpath="//span[text()='English (United States)']")
    public WebElement localeddown;
    
   
	
    @FindBy(xpath="//li[@class='select2-selection__rendered']")//dropdown
    //select2-language-ls-container
    public WebElement languageddown;
	
	
    @FindBy(name="phone")
    public WebElement phone;
	
	
    @FindBy(name="mobile")
    public WebElement mobile;
	
	
    @FindBy(name="skype")
    public WebElement skype;
	
	
	@FindBy(name="avatar")//Robot
    public WebElement profilephoto;
	
	
   @FindBy(id="user_type")//dropdown
    public WebElement usertypeddown;
	
	
    @FindBy(xpath="//span[@class='filter-option pull-left']")//dropdown
    public WebElement directionddown;
    
    @FindBy(xpath="//span[@title ='Select Designation']")//select2-designations_id-qs-container
    public WebElement designationddown;
    
    @FindBy(xpath="//option[@Value='1'and text()='Manager']")
    public WebElement desiginput;
    
    @FindBy(xpath="//input[@name='department_head_id']//following::span")
    public WebElement deptheadchkbox;
	
    @FindBy(xpath="//input[@name='permission']//following::span")//radiobutton
    public WebElement permissionradiobtn1 ;
	
	
    @FindBy(xpath="//button[text()='Create User']")
    public WebElement createuserbutton;
	
	public ProfileCreationPage(WebDriver driver)
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
			
			validateWebElementsPageStatus(newusertext);
			validateWebElementsPageStatus(fullname);
			validateWebElementsPageStatus(employmentid);
			validateWebElementsPageStatus(username);
			validateWebElementsPageStatus(password);
			validateWebElementsPageStatus(confirmpassword);
			validateWebElementsPageStatus( email);
			validateWebElementsPageStatus(localeddown);
			validateWebElementsPageStatus(phone);
			validateWebElementsPageStatus(mobile);
			validateWebElementsPageStatus(skype);
			validateWebElementsPageStatus(profilephoto);
			validateWebElementsPageStatus(usertypeddown);
			validateWebElementsPageStatus(designationddown);
			validateWebElementsPageStatus(createuserbutton);
		}
	
	
	
	public void clickonNewUser()
	{
		clickOnElement(newusertext);//sendKeys(Keys.RETURN);
	}
	
	public void enterFullname(String text)
	{
		enterText(fullname,text);
	}
	
	public void enterEmploymentId(String text)
	{
		enterText(employmentid,text);
	}
	public void enterUsername(String text)
	{
		enterText(username,text);
	}
	public void enterPassword(String text)
	{
		enterText(password,text);
	}
	public void confirmPassword(String text)
	{
		enterText(confirmpassword,text);
	}
	public void enterEmail(String text)
	{
		enterText(email,text);
	}
	public void enterPhoneNo(String text)
	{
		enterText(phone,text);
	}
	public void enterMobileNo(String text)
	{
		enterText(mobile,text);
	}
	public void enterSkypeId(String text)
	{
		enterText(skype,text);
	}
	public void profilePhotoUpload(WebDriver driver )
	{
		
		ImageUpload imgup = new ImageUpload();
		imgup.uploadImage(driver,profilephoto,"C:\\Downloaded Images\\images.jpg");
		
	}
	public void selectoptioninUserTypeDdown(String text)
	{
		manageDdown(usertypeddown, text);
   }
	
	public void localeDdown(String text)
	{
		localeddown.click();
		//input.sendkeys(text);
		languageddown.click();
		
	}
	
	public void languageDdown(String text)
	{
		Select select = new Select(languageddown);
		select.selectByVisibleText(text);
		//driver.findElement(languageddown).sendKeys(text);
	}
	public void directionDdown(String text)
	{
		Select select = new Select(directionddown);
		select.selectByVisibleText(text);
		//driver.findElement(directionddown).sendKeys(text);
	}
	
	public void selectoptioninDesignationDdown()
	{
		clickOnElement(designationddown);
		clickOnElement(desiginput);
		
		
	}
	
	
	public void clickonCreateUserbutton() 
	{
		clickOnElement(createuserbutton);
	}
	
}

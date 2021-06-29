package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;
import Utils.WaitElements;

public class FileManagerPage extends PageUtils{

	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement filemanagerpage;	
	
	public FileManagerPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
  
	@FindBy(xpath="//div[@title='New folder']")
	public WebElement newfolder;
	
	@FindBy(xpath="//div[@title='New text file']")
	public WebElement newfile;
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(filemanagerpage);
		}
	
	public void createNewFolder(String text) {
		
		WaitElements we = new WaitElements(driver);//explicit wait calling from utils 
		//we.waitForElement(10,driver.findElement(By.xpath("//div[@title='New folder']")));needs rework
		
		Actions action = new Actions(driver);
		clickOnElement(newfolder);
		action.sendKeys(text).build().perform();
		//action.keyDown(Keys.BACK_SPACE)
		action.sendKeys(Keys.RETURN);////
	}
	
	public void createNewFile(String text) {
		
		Actions action = new Actions(driver);
		clickOnElement(newfile);
		action.sendKeys(text).build().perform();
		action.sendKeys(Keys.RETURN);
	}
	
}

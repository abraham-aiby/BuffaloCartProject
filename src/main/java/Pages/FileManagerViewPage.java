package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class FileManagerViewPage extends PageUtils {
WebDriver driver;
	
	public FileManagerViewPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
  
	@FindBy(xpath="")
	public WebElement filemanagerpage;
	
	@FindBy(xpath="//input[@title='Incremental search is only from the current view.']")
	WebElement searchbtn;
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(filemanagerpage);
		}
	 public void validatePageWebElements()
		{
			validateWebElementsPageStatus(filemanagerpage);
			validateWebElementsPageStatus(searchbtn);
			
		}
	 
	
	public void searchFolder(String text) {
		//Actions action = new Actions(driver);
		clickOnElement(searchbtn);
		enterText(searchbtn,text);
		searchbtn.clear();
		
		//searchbtn.sendKeys (Keys.BACK_SPACE);
		//action.sendKeys(Keys.BACK_SPACE);
	
		
	}
	public void searchFile(String text) {
		Actions action = new Actions(driver);
		clickOnElement(searchbtn);
		enterText(searchbtn,text);
		searchbtn.clear();
		
		//searchbtn.sendKeys (Keys.BACK_SPACE);
	    //action.keyDown(Keys.BACK_SPACE);
		
	}
	

}

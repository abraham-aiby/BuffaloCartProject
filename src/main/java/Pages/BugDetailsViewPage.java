package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class BugDetailsViewPage extends PageUtils {
	

		WebDriver driver;
		
		@FindBy(xpath="")
		public WebElement bugspage;
		
		@FindBy(xpath="//a[text()='All Bugs']")
		public WebElement allbugs;
		
		@FindBy(xpath="//input[@type='search'and@class='form-control input-sm']")
		public WebElement searchcolumns;
		
		@FindBy(xpath="//a[text()='Click functionality of Help']")
		public WebElement identifybug;
		
		
		public BugDetailsViewPage (WebDriver driver )
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(bugspage);
		}
		public void validatePageWebElements()
		{
			validateWebElementsPageStatus(allbugs);
			validateWebElementsPageStatus(searchcolumns);
			validateWebElementsPageStatus(identifybug);
	
		}
		
		public void clickonAllBugs()
		{
			clickOnElement(allbugs);
		}
		
		public void enteronSearchColumns(String text)
		{
			enterText(searchcolumns,text);
		}
		
		public void clickonIdentifyBug()
		{
			clickOnElement(identifybug);
		}

}

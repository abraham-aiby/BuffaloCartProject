package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.PageUtils;

public class BugDetailsPage extends PageUtils {

	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement bugspage;
	
	@FindBy(xpath="//a[text()='New Bugs']")
	public WebElement newbugs;
	
	@FindBy(xpath="//input[@name='issue_no']")
	public WebElement issue;
	
	@FindBy(xpath="//input[@name='bug_title']")
	public WebElement bugtitle;
	
	@FindBy(xpath="//input[@name='related_to']")
	public WebElement relatedtoddown ;
	
	@FindBy(xpath="//select[@name='reporter']") //span
	public WebElement reporterddown ;
	
	@FindBy(xpath="//input[@name='priority']")
	public WebElement priorityddown ;
	
	@FindBy(xpath="//input[@name='severity']")
	public WebElement severityddown ;
	
	@FindBy(xpath="//input[@name='bug_status']")
	public WebElement bugstatusddown ;
	
	@FindBy(xpath="//input[@name='permission'and @value='everyone']")
	public WebElement assignedtoradio ;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	
	
	

	public BugDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void getElementDisplayStatus() 
	{
	validateElementDisplayStatus(bugspage);
	}
	
	public void clickonNewBugs()
	{
		clickOnElement(newbugs);
	}
	
	public void enterIssue(String text)
	{
		enterText(issue,text);
	}
	
	public void enterBugTitle(String text)
	{
		enterText(bugtitle,text);
	}
	
	public void selectoptioninRelatedtoDdown(String text)
	{
		Select select = new Select(relatedtoddown);
		select.selectByVisibleText(text);
	}
	
	public void selectoptioninReporterDdown(String text)
	{
		manageDdown(reporterddown,text);
	}
	
	public void selectoptioninPriorityDdown(String text)
	{
		Select select = new Select(priorityddown);
		select.selectByVisibleText(text);
	}
	
	public void selectoptioninSeverityDdown(String text)
	{
		Select select = new Select(severityddown);
		select.selectByVisibleText(text);
	}
	
	public void selectoptioninBugStatusDdown(String text)
	{
		Select select = new Select(bugstatusddown);
		select.selectByVisibleText(text);
	}
	
	public void bugStatusAssignedTo()
	{
		clickOnElement(assignedtoradio);
		clickOnElement(assignedtoradio);
	}
	
	public void clickonSave() 
	{
		clickOnElement(save);
	}
}





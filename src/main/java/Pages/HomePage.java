package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class HomePage extends PageUtils{
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement homepage;
	
	@FindBy(id="s-menu")
	public WebElement searchtextbox;
	
	
	@FindBy(xpath="//a[@title='User']")
	public WebElement user;
	
	@FindBy(xpath="//a[@title='Client']")
	public WebElement client;
	
	@FindBy(xpath="//a[@title='Bugs']")
	public WebElement bugs;
	
	@FindBy(xpath="//a[@title='Calendar']")
    public WebElement calender;
	
	@FindBy(xpath="//a[@title='File Manager']")
    public WebElement filemanager;
	
	@FindBy(xpath="//a[@title='Mailbox']")
    public WebElement mailbox;
	
	@FindBy(xpath="//a[@title='Articles']")
    public WebElement articles;
	
	@FindBy(xpath="//a[@title='Knowledge Base']")
    public WebElement knowledgebase;
	
	@FindBy(xpath="//span[text()='Knowledge Base']//preceding::em[@class='fa fa-question-circle']")
	public WebElement kbase;
	
	
	public HomePage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(homepage);
		}
	 public void clickonSearch()
		{
			clickOnElement(searchtextbox);
		}
	
	public void enterinSearchTextbox(String text)
	{
		enterText(searchtextbox,text);
	}
	public void clickonCalender()
	{
		clickOnElement(calender);
	}
	public void clickonUser()
	{
		clickOnElement(user);
	}
	public void clickonBugs()
	{
		clickOnElement(bugs);
	}
	public void clickonClient()
	{
		clickOnElement(client);
	}
	public void clickonFileManager()
	{
		clickOnElement(filemanager);
	}
	public void clickonMailbox()
	{
		clickOnElement(mailbox);
	}
	public void clickonArticles()
	{
		clickOnElement(articles);
	}
	public void clickonKBase()
	{
		clickOnElement(kbase);
		clickOnElement(knowledgebase);
	}

	public void clickonMenu(String menuName) {
		if(menuName.equalsIgnoreCase("Article"))
		{
			clickonArticles();
		}
		else if(menuName.equalsIgnoreCase("KnowledgeBase"))
		{
			clickonKBase();
		}
		else if(menuName.equalsIgnoreCase("Mailbox"))
		{
			clickonMailbox();
		}
		else if(menuName.equalsIgnoreCase("File Manager"))
		{
			clickonFileManager();
		}
		else if(menuName.equalsIgnoreCase("Client"))
		{
			clickonClient();
		}
		else if(menuName.equalsIgnoreCase("Bugs"))
		{
			clickonBugs();
		}
		else if(menuName.equalsIgnoreCase("User"))
		{
			clickonUser();
		}
		else if (menuName.equalsIgnoreCase("Calendar"))
		{
			clickonCalender();
		}
		
		
	}
}

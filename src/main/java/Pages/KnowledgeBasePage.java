package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class KnowledgeBasePage extends PageUtils {
	
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement knowledgebasepage;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//input[@id='slug']")
	WebElement slug;
	
	@FindBy(xpath="//div[@data-original-title='New Category']")
	WebElement addcategory;
	
	@FindBy(xpath="//button[@id='sbtn']")
	WebElement savecategory;
	
	@FindBy(xpath="//input[@name='category']")
	WebElement category;
	
	@FindBy(xpath="//input[@name='sort']")
	WebElement order;
	
	@FindBy(xpath="//button[@id='file-save-button']")
	WebElement savebtn;
	
	@FindBy(xpath="//a[@class='btn btn-xs btn-info']")
	WebElement newarticles;
	
	public KnowledgeBasePage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(knowledgebasepage);
		}
	
	 public void validatePageWebElements()
		{
			
			validateWebElementsPageStatus(title);
			validateWebElementsPageStatus(slug);
			validateWebElementsPageStatus(addcategory);
			validateWebElementsPageStatus(savecategory);
			validateWebElementsPageStatus(category);
			validateWebElementsPageStatus(order);
			validateWebElementsPageStatus(savebtn);
			validateWebElementsPageStatus(newarticles);
		}
	 
	
	public void clickonArticles()
	{
		clickOnElement(newarticles);
	}
	public void enterTitle(String text)
	{
		enterText(title,text);
	}
	public void enterSlug(String text)
	{
		enterText(slug,text);
	}
	public void clickonAddCategory()
	{
		clickOnElement(addcategory);
	}
	public void clickonSaveCategory()
	{
		clickOnElement(savecategory);
	}
	public void enterCategory(String text)
	{
		enterText(category,text);
	}
	public void enterOrder(String text)
	{
		enterText(order,text);
	}
	public void clickonSaveBtn()
	{
		clickOnElement(savebtn);
	}


}

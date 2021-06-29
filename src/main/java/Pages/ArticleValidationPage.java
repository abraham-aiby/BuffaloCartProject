package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class ArticleValidationPage extends PageUtils{
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement articlespage;
	
	
	@FindBy(xpath="//h4[text()='Category_1']")
	public WebElement mycategory;
	
	@FindBy(xpath="//i[@class='fa fa-hand-o-right']")
	public WebElement article;
	
	
	
	public ArticleValidationPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getElementDisplayStatus() 
	{
	validateElementDisplayStatus(articlespage);
	}
	
	
	
	public void clickonCategory()
	{
		clickOnElement(mycategory);
	}
	
	public void clickonArticle()
	{
		clickOnElement(article);
	}
	
	
}

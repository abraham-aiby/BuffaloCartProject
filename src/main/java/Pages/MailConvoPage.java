package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.PageUtils;
import Utils.WaitElements;

public class MailConvoPage extends PageUtils {
	
	WebDriver driver;
	
	public MailConvoPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="")
	public WebElement mailboxpage;

	@FindBy(xpath="//a[contains(text(),'Compose')]")
	WebElement compose;
	
	@FindBy(xpath="//select[@class='select_2_to select2-hidden-accessible']")
	WebElement recipientddown;
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement subject;
	
	@FindBy(xpath="//a[@id='cke_34']")
	WebElement boldbtn;
	
	@FindBy(xpath="//a[@id='cke_35']")
	WebElement italicbtn;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, ck_editor']")
	WebElement frame;
	
	@FindBy(xpath="//a[@id='cke_25']")
	WebElement imgbtn;
	
	@FindBy(xpath="//a[@id='cke_Link_169']")
	WebElement link;
	
	@FindBy(xpath="//input[@id='cke_160_textInput']")
	WebElement url;
	
	@FindBy(xpath="//input[@id='cke_165_select']")
	WebElement targetddown;
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(mailboxpage);
		}
	public void validatePageWebElements()
	{

		Assert.assertTrue(compose.isDisplayed(),"WebElement compose is not displayed");
		Assert.assertTrue(recipientddown.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(subject.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(boldbtn.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(italicbtn.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(frame.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(imgbtn.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(link.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(url.isDisplayed(),"WebElement mycategory not displayed");
		Assert.assertTrue(targetddown.isDisplayed(),"WebElement mycategory not displayed");
	
	}
	
	
	public void clickonComposeBtn()
	{
	
		try {
			WebElement compose = driver.findElement(By.xpath("//a[contains(text(),'Compose')]"));
			
			clickOnElement(compose);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement compose = driver.findElement(By.xpath("//a[contains(text(),'Compose')]"));
			clickOnElement(compose);
		}
	}
	public void selectoptioninRecipientDdown(String text)
	{
		manageDdown(recipientddown,text);
		
	}
	public void enterSubject(String text)
	{
		enterText(subject,text);
	}
	
	public void enterMessage(String text)
	{
		WaitElements we = new WaitElements(driver);
		we.fluentWaitForElement(10, frame);
		
		driver.switchTo().frame(frame);
		
		enterText(frame,text);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		clickOnElement(boldbtn);
		clickOnElement(frame);
		clickOnElement(boldbtn);
		/*
		Actions action = new Actions(driver); //right click
		action.contextClick(boldbtn).perform();*/
	}
	public void enterNextMessage(String text)
	{
		clickOnElement(italicbtn);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		enterText(frame,text);
		
		/*
		Actions action = new Actions(driver);right click
		action.contextClick(italicbtn).perform();*/
	}
	public void clickonImgBtn(String text) {
		clickOnElement(imgbtn);
		clickOnElement(link);
		clickOnElement(url);
		enterText(url,text);
		Select select = new Select(targetddown);
		select.selectByIndex(3);
	}
}

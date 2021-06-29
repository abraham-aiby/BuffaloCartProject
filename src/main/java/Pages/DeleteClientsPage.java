
package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class DeleteClientsPage extends PageUtils{
	
	
	WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement clientspage;	
	
	@FindBy(xpath="//label[text()='Search all columns:']//input[@type='search']")
	public WebElement searchuser;
	

     @FindBy(xpath="//button[@type='submit' and text() = 'Proceed Anyway!']")
     WebElement proceedButton;
     
	public DeleteClientsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 public void getElementDisplayStatus() 
		{
		validateElementDisplayStatus(clientspage);
		}
	 
	 public void validatePageWebElements()
		{
			validateWebElementsPageStatus(searchuser);
			validateWebElementsPageStatus(proceedButton);
	
			
		}
	 
	
	public void deleteUserslist(String s)
	{
		searchuser.sendKeys(s);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	String xpath = "//a[text()='"+s+"']/parent::*/following-sibling::td//a[@title='Click to Delete ']";
	//String xpath = "//a[text()='ObsquraClient12']/parent::*/following-sibling::td//a[@title='Click to Delete ']";
      //String xpath = "//td[text()='"+s+"']/following-sibling::td/a[@title='Click to Delete ']";
		try {
			WebElement delbtn = driver.findElement(By.xpath(xpath));
			 delbtn.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException e)
		{
			WebElement delbtn = driver.findElement(By.xpath(xpath));
		 delbtn.click();
		}
       proceedButton.click();
	}}
           //driver.findElement(By.xpath("//tr[@id='table_0']/td[text()='Obsqura1']/following-sibling::td/a[@title="Click To Delete']"));
//	      
		  
	       //driver.findElement(By.xpath("//tr[@id='table_0']/td[text()='Obsqura1']/following-sibling::td/a[@title="Click to Delete']"));
	



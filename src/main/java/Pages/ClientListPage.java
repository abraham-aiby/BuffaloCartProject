package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.PageUtils;

public class ClientListPage extends PageUtils{


 
 WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Next']")
	public WebElement nextbutton;
	
	@FindBy(xpath="//select[@name='DataTables_length']")
	public WebElement select;
	
	@FindBy(xpath="")
	public WebElement clientspage;
	

	@FindBy(xpath="//a[contains(text(),'Obsqura')]")
	 List<WebElement> clients;
		
	//(//a[text()='Next']//parent::li)/preceding-sibling::li[1]
	
	public void select100() 
	{
		Select dropdown = new Select(select);
		 dropdown.selectByValue("100");	
		 select.click();
	}
	
 public ClientListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
 public void validatePageWebElements()
	{
		validateWebElementsPageStatus(select);
		validateWebElementsPageStatus(nextbutton);
		validateWebElementsPageStatus(clientspage);
		
	}
 
 public void getElementDisplayStatus() 
	{
	validateElementDisplayStatus(clientspage);
	}
 
 public void clientList()
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow);
		
		for (WebElement client:clients)
		{
			System.out.println("parent window client name: " +client.getText());
			if(client.getText().contains("Obsqura"))
			{
				//client.click();
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
				client.sendKeys(selectLinkOpeninNewTab);
				Set<String> newBrowser = driver.getWindowHandles();
				for(String i:newBrowser)
				{
					//System.out.println(i);
				    if(!(i.equals(parentWindow)))
				    {
				    	driver.switchTo().window(i);
				    	//System.out.println(driver.getCurrentUrl());
				        WebElement clientname = driver.findElement(By.xpath("//div[@class='col-md-6']//div[@class='col-md-6']"));
						System.out.println("Client name: "+clientname.getText());
						driver.close();
						//  System.out.println("Close child window browser");
				       }
					}			
				}
			driver.switchTo().window(parentWindow);
		}
	}
} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
	/*
		public void BuffaloCartPageList()
		{
			String s =numberofpgs.getText();
			System.out.println("The No. of Pages is"+ s);
		}
		*/
		
		
		
		
	




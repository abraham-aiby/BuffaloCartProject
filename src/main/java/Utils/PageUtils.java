package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageUtils {
	
	
	public void validateElementDisplayStatus(WebElement element)
	{
		Assert.assertTrue(element.isDisplayed());
	}
	
	public void validateWebElementsPageStatus(WebElement element) 
	{
		Assert.assertTrue(element.isDisplayed(),"WebElement"+ element +"not displayed");
	}
	
	
	public void enterText(WebElement element,String str)
	{
		element.sendKeys(str);
	}
	
	public void clickOnElement(WebElement element)
	{
		element.click();
	}
	
	public void fetchText(WebElement element)
	{
		validateElementDisplayStatus(element);
		element.getText();
		System.out.println(element.getText());
		
	}
	
	public void manageDdown(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
}

package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageUtils;

public class CalendarDisplay extends PageUtils {
	WebDriver driver;
	
@FindBy(xpath="")
public WebElement calendarpage;	
	
@FindBy(xpath="//button[@type='button and text()='day']")
public WebElement daybtn;

@FindBy(xpath="//a[@class='fc-more']")
public WebElement morebtn;

@FindBy(xpath="//div[@class='fc-center']/h2")
public WebElement date;

@FindBy(xpath="//span//parent::th")
public WebElement day;

@FindBy(xpath="//div[@class='fc-content']")
public List<WebElement> events;

@FindBy(xpath="//button[@type='button'][2]")
public WebElement nextbtn;



public CalendarDisplay(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

public void getElementDisplayStatus() 
{
validateElementDisplayStatus(calendarpage);
}

public void clickonDayBtn()
{
	clickOnElement(daybtn);
}

public void getDayDateEvents()
{
	int i=0;
	nextbtn.click();
	while(i>7)
	{
		fetchText(date);
		fetchText(day);
		for(WebElement event:events)
		{
			fetchText(event);
		}
		System.out.println();
		clickOnElement(nextbtn);
		i++;
	}
	
}
}

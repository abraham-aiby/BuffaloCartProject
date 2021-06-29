package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.CalendarDisplay;

public class CalendarDisplayPageTest extends BaseTesterClass {


@Test( groups = "calendareventsdisplay")
public void calendarDisplayPageTest	()
{
	logWith("admin","123456");//loginpg
	navigateToMenu("Calendar");
	
	CalendarDisplay clndrdsply = new CalendarDisplay(driver);
	
	Assert.assertTrue(clndrdsply.date.isDisplayed(),"WebElement date is not displayed");
	Assert.assertTrue(clndrdsply.day.isDisplayed(),"WebElement day not displayed");
	Assert.assertTrue(clndrdsply.daybtn.isDisplayed(),"WebElement daybtn not displayed");
	Assert.assertTrue(clndrdsply.morebtn.isDisplayed(),"WebElement morebtn not displayed");
	
	clndrdsply.clickonDayBtn();
	clndrdsply. getDayDateEvents();
}
	
	
}

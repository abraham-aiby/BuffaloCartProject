package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.BugDetailsPage;


public class BugDetailsPageTest extends BaseTesterClass{
	
	
	

@Test (	groups = {"bugprofilecreation"})
public void bugDetailsPageTest()
{
	logWith("admin","123456");//loginpg
	navigateToMenu("Bugs");
	
	BugDetailsPage bugdtlpgobj = new BugDetailsPage(driver);
	
	Assert.assertTrue(bugdtlpgobj.newbugs.isDisplayed(),"WebElement New Bugs is not displayed");
	Assert.assertTrue(bugdtlpgobj.issue.isDisplayed(),"WebElementissue not displayed");
	Assert.assertTrue(bugdtlpgobj.bugtitle.isDisplayed(),"WebElement bugtitle not displayed");
	Assert.assertTrue(bugdtlpgobj.reporterddown.isDisplayed(),"WebElement reporterddown not displayed");
	Assert.assertTrue(bugdtlpgobj.save.isDisplayed(),"WebElement save not displayed");
	
	 bugdtlpgobj.clickonNewBugs();
	 bugdtlpgobj.enterIssue("FNT-001");
	 bugdtlpgobj.enterBugTitle("Click functionality of Help");
	 bugdtlpgobj.selectoptioninReporterDdown("abc (Client)");
	 bugdtlpgobj.clickonSave();
}

}
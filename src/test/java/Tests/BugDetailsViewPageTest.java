package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.BugDetailsPage;
import Pages.BugDetailsViewPage;

public class BugDetailsViewPageTest extends BaseTesterClass {
	


	@Test(groups = {"bugprofileview"})
	public void bugDetailsViewPageTest()
	{
		logWith("admin","123456");//loginpg
		navigateToMenu("Bugs");
		
		BugDetailsViewPage bugdtlviewpgobj = new BugDetailsViewPage(driver);

		 bugdtlviewpgobj.validatePageWebElements();
		 bugdtlviewpgobj.clickonAllBugs();
		 bugdtlviewpgobj.enteronSearchColumns("");
		 bugdtlviewpgobj.clickonIdentifyBug();
		
	}
	

}

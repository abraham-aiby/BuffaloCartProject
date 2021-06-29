package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.NewUserPage;

public class NewUserPageTest extends BaseTesterClass{
	
	
	
	@Test(groups="signinasnewuser")
	public void newUserPageTest()
	{
		logWith("admin","123456");//loginpg
		
		
		NewUserPage newuserpg = new NewUserPage(driver);
		newuserpg.validatePageWebElements();
		
		
		newuserpg.clickonSignUp();
		newuserpg.enterCompanyName("XYZ Ind");
		newuserpg.enterCompanyEmail("xyzindustries@gmail.com");
		newuserpg.enterCompanyUser("ssneha");
		newuserpg.enterCompanyPass("ssnehaXYZ@");
		newuserpg.confirmCompanyPass("ssnehaXYZ@");
		newuserpg.clickSubmit();
}

	
}

package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.LoginPage;
import Pages.ProfileCreationPage;

public class ProfileCreationPageTest extends BaseTesterClass {
	
	
	
	
	
@Test(groups="userprofilecreation")		
public void profileCreationPageTest()
{
	logWith("admin","123456");//loginpg
	navigateToMenu("User");

	ProfileCreationPage profilecrtnpgobj = new ProfileCreationPage(driver);
	profilecrtnpgobj.validatePageWebElements();
	
	profilecrtnpgobj.clickonNewUser();
	profilecrtnpgobj.enterFullname("Aiby Ann Abraham");
	profilecrtnpgobj.enterEmploymentId("131122");
	profilecrtnpgobj.enterUsername("aabraham");
	profilecrtnpgobj.enterPassword("aabraham123456");
	profilecrtnpgobj.confirmPassword("aabraham123456");
	profilecrtnpgobj.enterEmail("xyz123@gmail.com");
	//profilecrtnpgobj.BuffaloCartLocaleddown();profilecrtnpgobj.BuffaloCartLocaleddownItems();
	//profilecrtnpgobj.BuffaloCartLanguageddown("English");
	profilecrtnpgobj.enterPhoneNo("8281888888");
	profilecrtnpgobj.enterMobileNo("8281888888");
	profilecrtnpgobj.enterSkypeId("aaiby_skype");
	profilecrtnpgobj.profilePhotoUpload(driver);
	profilecrtnpgobj.selectoptioninUserTypeDdown("Staff");
	profilecrtnpgobj.selectoptioninDesignationDdown();
	//profilecrtnpgobj.BuffaloCartDirection("LTR");
    //profilecrtnpgobj.BuffaloCartDeptheadchkbox();
	//profilecrtnpgobj.BuffaloCartPermission();
	profilecrtnpgobj.clickonCreateUserbutton();
}


	}

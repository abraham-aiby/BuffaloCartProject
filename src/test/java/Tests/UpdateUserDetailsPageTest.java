package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.UpdateUserDetailsPage;

public class UpdateUserDetailsPageTest extends BaseTesterClass {
	
//site down

@Test(groups="updateuserdetails")
public void updateUserDetailsPageTest() 
{
	logWith("admin","123456");//loginpg
	navigateToMenu("User");
	
	
	UpdateUserDetailsPage updateuserdetailspg = new UpdateUserDetailsPage(driver);
	updateuserdetailspg.validatePageWebElements();

updateuserdetailspg.searchColumns("ssneham");
updateuserdetailspg.clickonUser();
updateuserdetailspg.clickonResetPass();
updateuserdetailspg.enterCurrentPass("123456");
updateuserdetailspg.enterNewPass("ssnehamXYZ");
updateuserdetailspg.enterConfirmPass("ssnehamXYZ");
updateuserdetailspg.clickonUpdatePass();

	
}	
	

}

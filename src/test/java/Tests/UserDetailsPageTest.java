package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.UserDetailsPage;

//import Pages.LoginPage;

public class UserDetailsPageTest extends BaseTesterClass{
	
	
	
	
@Test(groups="viewuserprofile")	
public void userDetailsPageTest()
{
	logWith("admin","123456");//loginpg
	navigateToMenu("User");
	
	
	UserDetailsPage userdetailspgobj = new UserDetailsPage(driver);
	

	Assert.assertTrue(userdetailspgobj.allusers.isDisplayed(),"WebElement allusers is not displayed");
	Assert.assertTrue(userdetailspgobj.searchcolumns.isDisplayed(),"WebElement searchcolumns not displayed");
	Assert.assertTrue(userdetailspgobj.identifyname.isDisplayed(),"WebElement identifyname is not displayed");
	
	userdetailspgobj.clickonAllUsers();
	userdetailspgobj.enterinSearchColumns("Sneha");
	userdetailspgobj.clickonIdentifyName();
}
	
	}

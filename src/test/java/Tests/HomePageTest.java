package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BaseTesterClass{
	
    
@Test (groups = "landonhomepage")
public void homePageTest()
{

	logWith("admin","123456");//loginpg
	HomePage homePage = new HomePage(driver);
	homePage.clickonSearch();
}

	


}
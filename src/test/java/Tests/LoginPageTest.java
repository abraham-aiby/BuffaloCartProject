package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.LoginPage;
import Utils.Screenshots;

public class LoginPageTest extends BaseTesterClass {
	

	
@Test	(groups = "loginscenario")
public void loginPageTest()
{
	
	LoginPage loginpgobj = new LoginPage(driver);
	loginpgobj.enterUsername("admin"); 
	loginpgobj.enterPassword("123456");
	loginpgobj.clickonSignIn();

	
}

	

	
	}


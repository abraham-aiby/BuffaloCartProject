package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseTester.BaseTesterClass;
import Pages.LoginPage;

public class DemoLoginPageTest extends BaseTesterClass {
	

	
	public static void main(String args[])
	{
		demoLoginPageTest();
	}
public static void demoLoginPageTest()
{
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://buffalocart.com/demo/erp/admin/dashboard");
	
	LoginPage loginpgobj = new LoginPage(driver);
	loginpgobj.enterUsername("admin"); 
	loginpgobj.enterPassword("123456");
	loginpgobj.clickonSignIn();
	driver.close();
}
}


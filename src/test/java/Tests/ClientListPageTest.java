package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.ClientListPage;



public class ClientListPageTest extends BaseTesterClass {
	
	
	@Test( groups = "getclientlist")
	public void clientListPageTest()
	{
	logWith("admin","123456");//loginpg
	navigateToMenu("Clients");
		
		
	ClientListPage clientlistpgobj = new ClientListPage(driver);
	clientlistpgobj.validatePageWebElements();
	clientlistpgobj.clientList();

	
	
}
	}
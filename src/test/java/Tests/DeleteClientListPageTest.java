package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.DeleteClientsPage;
import Utils.ExcelUtils;

public class DeleteClientListPageTest extends BaseTesterClass {
	
	

	@Test(groups="deleteclientfromexcel")
	public void deleteClientListPageTest() throws IOException
	{
		logWith("admin","123456");//loginpg
		navigateToMenu("Client");
		
		
		
		DeleteClientsPage delclntspgobj = new DeleteClientsPage(driver);
		delclntspgobj.validatePageWebElements();
		ExcelUtils ex = new ExcelUtils();
	    ex.excelData();
	    System.out.println(ex.excelData());
		delclntspgobj.deleteUserslist("ObsquraClient12");
		
		
	}
	
	
}

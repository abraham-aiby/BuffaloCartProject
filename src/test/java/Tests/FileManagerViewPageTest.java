package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.FileManagerPage;
import Pages.FileManagerViewPage;

public class FileManagerViewPageTest extends BaseTesterClass{
	

	
	@Test(groups="searchfilenfolder")
	public void fileManagerPagetest()
	{
		logWith("admin","123456");//loginpg
		navigateToMenu("FileManager");
		
		FileManagerViewPage filemngrvpgtest  = new FileManagerViewPage(driver);
		filemngrvpgtest.validatePageWebElements();
		filemngrvpgtest.searchFolder("VWXYZ-Folder");
		filemngrvpgtest.searchFile("VWXYZ-File");
	}
	

}

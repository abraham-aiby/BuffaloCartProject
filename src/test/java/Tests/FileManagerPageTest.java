package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.FileManagerPage;

public class FileManagerPageTest extends BaseTesterClass{
	
	
	
	@Test(groups="createfilenfolder")
	public void fileManagerPagetest()
	{
		logWith("admin","123456");//loginpg
		navigateToMenu("FileManager");
		

		FileManagerPage filemngrpgtest  = new FileManagerPage(driver);

		Assert.assertTrue(filemngrpgtest.newfile.isDisplayed(),"WebElement newfile is not displayed");
		Assert.assertTrue(filemngrpgtest.newfolder.isDisplayed(),"WebElement newfolder not displayed");
		
		filemngrpgtest.createNewFile("VWXYZ-File");
		filemngrpgtest.createNewFolder("VWXYZ-Folder");
	}
	

}

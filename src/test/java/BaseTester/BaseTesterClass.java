package BaseTester;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.Screenshots;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTesterClass { //download gecko,edge or dependency
	public WebDriver driver;
	public  void testInitialize(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",  "C:\\BrowserDriver\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\BrowserDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\edgedriver_win64\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else {
			throw new Exception("Invalid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@BeforeMethod
	@Parameters({"browser","url"})
	public void setUp(String browser,String urlvalue) throws Exception {
		testInitialize(browser);
		driver.get(urlvalue);
		
	}

	@AfterMethod   //failed
	public void tearDown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			File screenshot=takescreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("C:\\Users\\Aiby\\eclipse-workspaceA\\BuffaloCart\\src\\main\\resources\\Screenshots_failed"+result.getName()+".png"));
		}


		else if(ITestResult.SUCCESS==result.getStatus())
			{
			Screenshots s = new Screenshots();
			s.takeScreenshots(result.getName().toString()+"_success" , driver);
			}
		driver.close();
	
	}
	public void logWith(String username , String password)
	{
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUsername(username);
	loginPage.enterPassword(password);
	loginPage.clickonSignIn();

}
	public void navigateToMenu(String menuName)
	{
		HomePage homePage = new HomePage(driver);
		homePage.clickonMenu(menuName);
		
	}




}




















 
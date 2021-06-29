package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.MailConvoPage;

public class MailConvoPageTest extends BaseTesterClass{
	

	
	@Test(groups="mailconversation")
	public void mailConvoPageTest()
	{
	logWith("admin","123456");//loginpg
	navigateToMenu("Mailbox");
		
		
	MailConvoPage mailconvopg = new MailConvoPage(driver);
	
	mailconvopg.validatePageWebElements();
	
     mailconvopg.clickonComposeBtn();
     mailconvopg.selectoptioninRecipientDdown("snehamathewxyz@gmail.com");
     mailconvopg.enterSubject("Urgent Notice");
     mailconvopg.enterMessage("Attention Team");
     mailconvopg.enterNextMessage("New Timings");
     mailconvopg.clickonImgBtn("https://www.google.com/search?q=soothing+images&sxsrf=ALeKk00Gt4-px0U5DTWS8WY0vrOTonfmRg:1623951931244&tbm=isch&source=iu&ictx=1&fir=1Eqjxk1q_KLHRM%252CETichc2xbZIsnM%252C_&vet=1&usg=AI4_-kQTCrlwc4q5hznLN9Zq9KJ8DW0Jbg&sa=X&ved=2ahUKEwjhu_mvnJ_xAhU273MBHUZxB8QQ9QF6BAgNEAE#imgrc=1Eqjxk1q_KLHRM");
}
	
}
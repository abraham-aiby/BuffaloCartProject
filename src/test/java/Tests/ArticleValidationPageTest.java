package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.ArticleValidationPage;
import Pages.LoginPage;

public class ArticleValidationPageTest extends BaseTesterClass {
	
	
	@Test( groups = "viewarticle")
	public void articleValidationPagetest()
	{
		logWith("admin","123456");//loginpg
		navigateToMenu("Articles");//homepg
		
		ArticleValidationPage articleValidation = new ArticleValidationPage(driver);
        
		Assert.assertTrue(articleValidation.article.isDisplayed(),"WebElement article is not displayed");
		Assert.assertTrue(articleValidation.mycategory.isDisplayed(),"WebElement mycategory not displayed");
		//Assert.assertTrue(condition, message);
	
		articleValidation.clickonCategory();
		articleValidation.clickonArticle();
	
	}
	

}

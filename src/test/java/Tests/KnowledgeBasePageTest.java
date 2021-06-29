package Tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTester.BaseTesterClass;
import Pages.KnowledgeBasePage;

public class KnowledgeBasePageTest extends BaseTesterClass {

	

@Test( groups = "createknowledgebase")
public void knowledgeBasePagetest()
{
	logWith("admin","123456");//loginpg
	navigateToMenu("KnowledgeBase");
	
	
	KnowledgeBasePage knowledgeabsepg = new KnowledgeBasePage(driver);
	knowledgeabsepg.validatePageWebElements();
	
	knowledgeabsepg.clickonArticles();
	knowledgeabsepg.enterTitle("Category_2");
	knowledgeabsepg.enterSlug("Category_Slug");
	knowledgeabsepg.clickonAddCategory();
	knowledgeabsepg.enterCategory("2nd Category");
	knowledgeabsepg.enterOrder("Demo Order(2c)");
	knowledgeabsepg.clickonSaveCategory();
	knowledgeabsepg.clickonSaveBtn();
}
	

}

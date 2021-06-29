package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElements {
	static WebDriver driver;
	
	public WaitElements(WebDriver driver)//Writing it in here in order to avoid passing driver as parameter in every single function written below 
	{
		this.driver=driver;
		
	}
	
	public void waitForElement(int t,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,t);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForAlert(int t)
	{
		WebDriverWait wait = new WebDriverWait(driver,t);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void fluentWaitForElement( int t,WebElement element)
	{
		Wait wait = new FluentWait(driver).pollingEvery(Duration.ofSeconds(t)).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
}

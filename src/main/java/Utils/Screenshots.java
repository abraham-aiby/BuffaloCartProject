package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	static WebDriver driver;

	public void takeScreenshots(String Filename, WebDriver driver)
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("C:\\Users\\Aiby\\eclipse-workspaceA\\BuffaloCart\\src\\main\\resources\\ScreenshotsFolder" +Filename+".jpg"));
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}}

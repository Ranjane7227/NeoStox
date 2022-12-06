package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GeneralSSUse
{
	public static void screenshotuse(WebDriver driver,String name) throws IOException
	{
		File refrence = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	     File refrence1 = new File("D:\\SS\\SCR"+name+".jpg");
	     
	     org.openqa.selenium.io.FileHandler.copy(refrence, refrence1);
		
	}
}

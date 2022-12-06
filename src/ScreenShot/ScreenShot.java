package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         
        driver.get("https://www.nike.com/in/");
        File refrence = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File refrence1 = new File("D:\\SS\\Nike.jpg");
        
        org.openqa.selenium.io.FileHandler.copy(refrence, refrence1);
	}

}


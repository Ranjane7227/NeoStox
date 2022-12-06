package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxUtility.neoStoxUtilityClass;

public class neoStoxURLLaunch 
{
	  protected WebDriver driver;
      public void launchBrowser() throws IOException
      {
    	  driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get(neoStoxUtilityClass.propertyfile("URL"));
    	 
    	 neoStoxUtilityClass.Wait(driver, 1000);
      }
}

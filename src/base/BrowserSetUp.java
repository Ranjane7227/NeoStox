package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityUpStock.GeneralMethods;

public class BrowserSetUp 
{
  protected WebDriver driver ;
	public void BrowserLaunch() 
	{
	    driver = new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		GeneralMethods.dynamicwait(driver, 1000);
	}
}

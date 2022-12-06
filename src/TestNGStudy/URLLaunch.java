package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class URLLaunch 
{
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://login-v2.upstox.com/");
  }
}

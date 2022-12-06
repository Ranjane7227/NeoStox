package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialandParallel2 {
  @Test
  
	  public void instagram() 
	  {
		  
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.instagram.com/accounts/login/");
	  }
  }


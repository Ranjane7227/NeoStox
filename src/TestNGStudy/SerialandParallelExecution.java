package TestNGStudy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SerialandParallelExecution {
  @Test
  public void facebook()
  {
	  
      WebDriver driver = new EdgeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.facebook.com/login/");
  }
  
}

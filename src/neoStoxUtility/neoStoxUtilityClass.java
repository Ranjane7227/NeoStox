package neoStoxUtility;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class neoStoxUtilityClass 
{
 public static String propertyfile(String Key) throws IOException
 {
	 Properties QA = new Properties();
	 FileInputStream QS = new FileInputStream("D:\\Eclipse\\Eclipse Workspace IMP\\SeleniumProject\\src\\neoStox.properties");
     QA.load(QS);
     
      String Refrence = QA.getProperty(Key);
	  return Refrence;
    
	 
 }
  
   public static void Wait(WebDriver driver,int time) 
   {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
   }
  
}

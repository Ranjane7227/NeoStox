package FindElementsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
       List<WebElement> AQ = driver.findElements(By.tagName("a"));
       System.out.println(AQ.size());
       for (WebElement R:AQ)
       {
    	   System.out.println(R.getText());
       }
       
        

	}

}

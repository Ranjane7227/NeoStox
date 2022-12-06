package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
       WebElement refrence = driver.findElement(By.xpath("//button[@type='submit']"));
       
       System.out.println(refrence.isEnabled());
       
       driver.findElement(By.id("mobileNumber")).sendKeys("8421726048");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
       
      // WebElement refrence1= driver.findElement(By.xpath("//button[@type='submit']"));
       
      // System.out.println(refrence1.isEnabled());
        
	}

}

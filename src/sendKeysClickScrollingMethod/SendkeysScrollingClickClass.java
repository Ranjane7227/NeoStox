package sendKeysClickScrollingMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysScrollingClickClass 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys();
		
	}

}

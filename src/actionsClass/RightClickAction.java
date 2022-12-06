package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement refrence = driver.findElement(By.xpath("//span[text()='right click me']"));
		
         Actions QW= new Actions(driver);
         
         //QW.contextClick(refrence).perform();
         
//         QW.moveToElement(refrence).perform();
//         QW.contextClick().perform();
         
         QW.moveToElement(refrence).contextClick().build().perform();
         WebElement refrence1 = driver.findElement(By.xpath("//span[text()='Delete']"));
         
         QW.click(refrence1).perform();

	}

}

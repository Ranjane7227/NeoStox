package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class DoubleClickAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement refrence = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions as=new Actions(driver);
		
		as.doubleClick(refrence).perform();   
		
		//as.moveToElement(refrence).perform();
		//as.doubleClick().perform();             
		
        //as.moveToElement(refrence).doubleClick().build().perform();
        
		

	}

}

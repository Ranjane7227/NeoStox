package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
      
      driver.get("https://demo.guru99.com/test/drag_drop.html");
      Thread.sleep(500);
     WebElement sourcerefrence = driver.findElement(By.xpath("//a[text()=' BANK ']"));
     WebElement destinationrefrence = driver.findElement(By.id("bank"));
     
     Actions qw= new Actions(driver);
     qw.dragAndDrop(sourcerefrence, destinationrefrence).perform();	
	}

}

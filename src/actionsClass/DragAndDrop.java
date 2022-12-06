package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
      
      driver.get("https://demoqa.com/droppable");
      Thread.sleep(500);
      WebElement sourcerefrence = driver.findElement(By.id("draggable"));
      WebElement destionationRefrence = driver.findElement(By.id("droppable"));
      Thread.sleep(500);
      Actions AQ=new Actions(driver);
      AQ.dragAndDrop(sourcerefrence, destionationRefrence).perform();
      
      
       

	}

}

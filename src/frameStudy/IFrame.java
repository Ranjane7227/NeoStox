package frameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement refrence = driver.findElement(By.id("sampleHeading"));
        System.out.println(refrence.getText());
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement refrence1 = driver.findElement(By.id("sampleHeading"));
        System.out.println(refrence1.getText());
        
       
        
     
	}

}

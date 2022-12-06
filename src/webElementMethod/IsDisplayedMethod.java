package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement refrence = driver.findElement(By.id("displayed-text"));
        
       System.out.println(refrence.isDisplayed());   
       
       driver.findElement(By.id("hide-textbox")).click();
       WebElement refrence1 = driver.findElement(By.id("displayed-text"));
       
       System.out.println(refrence1.isDisplayed());   
       
       
	}

}

package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://omayo.blogspot.com/");
        WebElement refrence = driver.findElement(By.id("drop1"));
        
        Select AQ=new Select(refrence);
        //AQ.selectByIndex(2);  //select by index
        
       // AQ.selectByValue("jkl"); //select by string value
        
        AQ.selectByVisibleText("doc 4"); //select by visible text.
        
	}

}

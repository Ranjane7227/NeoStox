package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement Refrence = driver.findElement(By.id("checkBoxOption2"));
        
        System.out.println(Refrence.isSelected());
        
        WebElement Refrence1 = driver.findElement(By.id("checkBoxOption2"));
        Refrence1.click();
        System.out.println(Refrence1.isSelected());
        
	}

}

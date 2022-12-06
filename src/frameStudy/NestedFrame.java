package frameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        WebElement refrence = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(refrence.getText());
        
        driver.switchTo().parentFrame();
        WebElement refrence1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        System.out.println(refrence1.getText());
        
      
        
        
	}

}

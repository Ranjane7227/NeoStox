package FindElementsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartReviews 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        
       driver.findElement(By.name("q")).sendKeys("iphone");
       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
       
       Thread.sleep(2000);
       String RefrenceVariable = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
       System.out.println(RefrenceVariable);
       
	}
	 

}

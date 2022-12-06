package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("iphone");
        Thread.sleep(1000);
        List<WebElement> Refrence = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        for(WebElement PhoneRefrence:Refrence)
        {
        	System.out.println(PhoneRefrence.getText());
        	 String PhoneName="iphone 14 pro max";
        	 
             if(PhoneName.equals(PhoneRefrence.getText()))
             {
            	 PhoneRefrence.click();
            	 
            	 driver.findElement(By.xpath("//a[text()='Images']")).click();
            	 Thread.sleep(1000);
            	 List<WebElement> Images = driver.findElements(By.tagName("img"));
            	 
            	 System.out.println("count of Iphone 14 pro max Images"+Images.size());
            	 break;
            	 
             }
             
        }
        
        
	}

}

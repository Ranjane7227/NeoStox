package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class ChildbrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Google']")).click();
        
        //Set<String> AQ = driver.getWindowHandles();
        String QA = driver.getWindowHandle();
        System.out.println(QA);
        
        System.out.println("==================For Each===============");
        Set<String> AQ = driver.getWindowHandles();
        
        for(String Refrence:AQ)
        {
        	System.out.println(Refrence);
        }
        System.out.println("===========Iterator==============");
        Iterator<String> RefrenceI = AQ.iterator();
        String Main = RefrenceI.next();
        String Child = RefrenceI.next();
        System.out.println(Main);
        System.out.println(Child);
        
        driver.switchTo().window(Child);
        Thread.sleep(2500);
        driver.manage().window().maximize();
        driver.close();
        driver.switchTo().window(Main);
    
       String MainPageText = driver.findElement(By.xpath("//h1[text()='Find a job & grow your career']")).getText();
        System.out.println(MainPageText);
        
        
        
        
        
        
	}

}

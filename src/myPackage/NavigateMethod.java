package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login/"); //to navigate page
        Thread.sleep(1500); //time
        driver.manage().window().maximize(); //to maximize the website
        Thread.sleep(1500); //time
       // driver.manage().window().minimize(); // to minimize the website
        
        driver.navigate().to("https://vctcpune.com/selenium/practice.html"); //to open another website
        Thread.sleep(1500);
        
       // driver.navigate().back(); //to back on first website
        
       // driver.navigate().forward();//to forward  on first website
        
        driver.navigate().refresh();//to refresh the page
        driver.close();
        
   
	}

}

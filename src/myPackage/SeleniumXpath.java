package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html"); //to open link
		
		//driver.findElement(By.xpath("//input[@name='checkBoxOption1'] ")).click(); //click method
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("SanketRanjane");//send keys used to give value on website
		//Thread.sleep(2000); //time
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear(); //to clear the text
		
		String URL = driver.getCurrentUrl(); //TO GET URL method in console box
		System.out.println("Current open URL is "+URL);
		
	}

}

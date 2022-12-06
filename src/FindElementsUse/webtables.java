package FindElementsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        String refrencevariable = driver.findElement(By.xpath("//table[@id='product']//tbody")).getText();
        System.out.println(refrencevariable);
        System.out.println("====================No. Of Rows=================");
       int RefrenceVariable1 = driver.findElements(By.xpath("//table[@id='product']//th")).size();
       System.out.println(RefrenceVariable1);
       
       System.out.println("===========No. of Rows===========");
      int RefrenceVariable2 = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
      System.out.println(RefrenceVariable2);
      
      System.out.println("==========Particular data from table=======");
      
      String RefrenceVariable3 = driver.findElement(By.xpath("//table[@id='product']//tr[6]//td[2]")).getText();
      System.out.println(RefrenceVariable3);
       
       
	}

}

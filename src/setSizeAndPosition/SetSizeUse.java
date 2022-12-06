package setSizeAndPosition;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        
        System.out.println(driver.manage().window().getSize());
        Dimension D = new Dimension(2000, 1200);
        driver.manage().window().setSize(D);
     
	}

}

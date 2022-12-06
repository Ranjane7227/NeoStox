package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionUse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        System.out.println(driver.manage().window().getPosition());
        
        Point p= new Point(80, 80);
        driver.manage().window().setPosition(p);


	}

}

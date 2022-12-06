package FindElementsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfCountOfImages {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/search?q=bike&rlz=1C1ONGR_enIN958IN958&sxsrf=ALiCzsaFTa-GMFkKSlXt58VRaG4NXxTIcw:1665138565999&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiapenF9M36AhXF1zgGHWp7CQgQ_AUoAnoECAIQBA&cshid=1665138717399110&biw=1280&bih=569&dpr=1.5");
        List<WebElement> RS = driver.findElements(By.tagName("img"));
        System.out.println(RS.size());
        
       
        
	}

}

package upStockPOMExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{

	@FindBy(xpath = "(//button[@type='button'])[9]")private WebElement noThanks;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickNoThanks()
	{
		noThanks.click();
	}
}

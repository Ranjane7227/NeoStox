package upStockPOMExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage 
{
	//declaration
	
	@FindBy(name = "yob")private WebElement  passcode;
	
	//initialization
	public PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void enterPasscode(String name)
	{
		passcode.sendKeys(name);
	}
	

}

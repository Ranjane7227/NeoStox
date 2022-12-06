package upStocksFormPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//declaration
	
	@FindBy(name = "userId") private WebElement userID;
	@FindBy(name = "password")private WebElement passWord;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement SignInButton;
	
	//Initialization
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
     
	public void enterUserID(String name)
	{
		userID.sendKeys(name);
	}
	
	public void enterPassword(String name)
	{
		passWord.sendKeys(name);
		
	}
	
	public void clicksignIn()
	{
		SignInButton.click();
	}
	
	
	
	
}

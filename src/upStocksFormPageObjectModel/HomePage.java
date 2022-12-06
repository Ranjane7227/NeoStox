package upStocksFormPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement UserName;
	@FindBy(xpath = "//div[text()='Logout']")private WebElement LogoutBtn;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String vaildateUsername()
	{
		String username =UserName.getText();
	    return username;
		
	}
	public void logout() throws InterruptedException
	{
		UserName.click();
		Thread.sleep(500);
		LogoutBtn.click();
	}

}

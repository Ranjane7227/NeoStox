package neoStoxPOM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PasswordPage 
{
	@FindBy(xpath = "//input[@id='txt_accesspin']") private WebElement Password;
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']") private WebElement Submit;
    @FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement OK;
    @FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement Close;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String passPIN) throws InterruptedException
      {
	Password.sendKeys(passPIN);
	Reporter.log("Enter your Password Button",true);

	Thread.sleep(2000);
	  }
	public void clickonSubmit() throws InterruptedException
	{
		Submit.click();
		Reporter.log("Click on Sumbit Button ",true);

		Thread.sleep(2000);
	}
	public void clickOnok() throws InterruptedException
	{
		OK.click();
		Reporter.log("Click On OK Button",true);

		Thread.sleep(2000);
	}
	public void clickonClose() throws InterruptedException
	{
		Close.click();
		Reporter.log("Click on Close Button",true);

		Thread.sleep(2000);
	}
}

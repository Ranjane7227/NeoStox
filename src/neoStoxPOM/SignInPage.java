package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage 
{
 @FindBy(xpath = "//input[@name='ctl00$MainContent$signinsignup$txt_mobilenumber']")private  WebElement MobileNumber;
 @FindBy(xpath = "(//a[text()='Sign In'])[2]")private WebElement SignIN;

 public SignInPage(WebDriver driver)
 {
	 
	 PageFactory.initElements(driver, this);
 }
 
  public void enterMobileNumber(String mobNo) 
  {
	MobileNumber.sendKeys(mobNo);  
	Reporter.log("Enter your mobile number",true);
  }
  public void clickOnSignInButton()
  {
	  SignIN.click();
	  Reporter.log("Click On SignIN Button",true);

  }
 
}

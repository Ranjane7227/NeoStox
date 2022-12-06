package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage 
{
 @FindBy(xpath = "//span[@id='lbl_username']") private WebElement Username;
 @FindBy(xpath = "//a[@id='lnk_logout']") private WebElement logout;
 public HomePage(WebDriver driver) 
 {
	PageFactory.initElements(driver, this );
 }
 public String  ActualUserName()
 {
	 String name = Username.getText();
	 return name;
 }
 
 public void logout()
 {
	 Username.click();
	 logout.click();
	 Reporter.log("Click On LogOut Button",true);

 }
 
}

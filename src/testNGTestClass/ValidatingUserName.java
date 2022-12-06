package testNGTestClass;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BrowserSetUp;
import upStockPOMExcel.HomePage;
import upStockPOMExcel.LoginPage;
import upStockPOMExcel.PasscodePage;
import upStockPOMExcel.WelcomePage;
import utilityUpStock.GeneralMethods;

public class ValidatingUserName extends BrowserSetUp
{
   WebDriver driver ;
   LoginPage Login;
   PasscodePage Password;
   WelcomePage Welcome;
   HomePage Home;
   String TC="1234";
   
  @Test
  public void ValidatingUserID() throws EncryptedDocumentException, IOException 
  {
   Assert.assertEquals(Home.vaildateUsername(), GeneralMethods.excelReading(1, 0));
   Reporter.log("UserID validation ", true);
   GeneralMethods.screenshot(driver, TC);
   GeneralMethods.dynamicwait(driver, 1000);
   
  }
  @BeforeClass
  public void BrowserOpen() 
  {
	  BrowserLaunch();
	  Login = new LoginPage(driver);
	  Password = new PasscodePage(driver);
	  Welcome = new WelcomePage(driver);
	  Home= new HomePage(driver);
  }
  @BeforeMethod
  public void LoginToUpstocks() throws EncryptedDocumentException, IOException 
  {
	  Login.enterUserID(GeneralMethods.excelReading(0, 0));
	  Login.enterPassword(GeneralMethods.excelReading(0, 1));
	  Login.clicksignIn();
	  Reporter.log("Sending UserID & Password", true);
	  GeneralMethods.dynamicwait(driver, 1000);
	  Password.enterPasscode(GeneralMethods.excelReading(0, 2));
	  Reporter.log("Sending Passcode", true);
	  GeneralMethods.dynamicwait(driver, 1000);
	  Welcome.clickNoThanks();
	  Reporter.log("Click ON No Thanks", true);
	  GeneralMethods.dynamicwait(driver, 5000);
	  
  }
  @AfterMethod
  public void LogOutFromUpStocks() throws InterruptedException 
  {
	  
	  Home.logout();
	  Reporter.log("Logout From UPstock", true);
	  GeneralMethods.dynamicwait(driver, 1000);
  }
  @AfterClass
  public void CloseBrowser() 
  {
   driver.close();
   Reporter.log("Closing Browser", true);
  }
}

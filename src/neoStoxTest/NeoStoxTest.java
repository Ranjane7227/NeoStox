package neoStoxTest;

import org.testng.annotations.Test;

import neoStoxBase.neoStoxURLLaunch;
import neoStoxPOM.HomePage;
import neoStoxPOM.PasswordPage;
import neoStoxPOM.SignInPage;
import neoStoxUtility.neoStoxUtilityClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NeoStoxTest extends neoStoxURLLaunch 
{
	SignInPage SignIN;
	PasswordPage Password;
	HomePage Username;
	
	
	
  @Test
  public void f() throws IOException 
  {
	 Assert.assertEquals(Username.ActualUserName(), neoStoxUtilityClass.propertyfile("ExpectedName"),"Test Case is Failed");
	 Reporter.log("Expecyed and actual username is matched Test case is pass",true);

	 
  }
  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException 
  {
	  SignIN.enterMobileNumber(neoStoxUtilityClass.propertyfile("MobileNo."));
	  SignIN.clickOnSignInButton();
	  neoStoxUtilityClass.Wait(driver, 5000);
	  Password.enterPassword(neoStoxUtilityClass.propertyfile("Password"));
	  Password.clickonSubmit();
	  neoStoxUtilityClass.Wait(driver, 5000);
	  Password.clickOnok();
	  neoStoxUtilityClass.Wait(driver, 5000);
	  Password.clickonClose();
	  neoStoxUtilityClass.Wait(driver, 5000);
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Username.logout();
  }

  @BeforeClass
  public void beforeClass() throws IOException
  {
	  launchBrowser();
	  SignIN = new SignInPage(driver);
	  
	  Password = new PasswordPage(driver);
	  
	  Username= new HomePage(driver);
  }

  @AfterClass
  public void afterClass()
  {
  driver.close();
  }

}

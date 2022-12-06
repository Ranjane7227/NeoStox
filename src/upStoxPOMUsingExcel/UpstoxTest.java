package upStoxPOMUsingExcel;

import org.testng.annotations.Test;

import ExcelData.GeneralExcelSheetReading;
import ScreenShot.GeneralSSUse;
import ScreenShot.ScreenShot;
import upStockPOMExcel.FundsPage;
import upStockPOMExcel.HomePage;
import upStockPOMExcel.LoginPage;
import upStockPOMExcel.PasscodePage;
import upStockPOMExcel.WelcomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UpstoxTest 
{
	
	WebDriver driver;
	LoginPage login;
	PasscodePage passcode;
	WelcomePage welcomepage;
	HomePage home;
	//FundsPage funds;
	
	
	
	
	@BeforeClass
	  public void launchBrowser() 
	  {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login-v2.upstox.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 login=new LoginPage(driver);
		 passcode=new PasscodePage(driver);
		 welcomepage= new WelcomePage(driver);
		 home=new HomePage(driver);
		 //funds=new FundsPage();
	  }
	
	
	 @BeforeMethod
	  public void loginToUPStocks() throws EncryptedDocumentException, IOException 
	  {
		 File myFile=new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		   
			
		login.enterUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
	    login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	    login.clicksignIn();
	    
    	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			 
			 //passcode
			 passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
			 //welcomepage
			 welcomepage.clickNoThanks();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  }
	
	 
     @Test
	  public void validateUserName() throws EncryptedDocumentException, IOException 
	  {
    	 File myFile=new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
 		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
 		   
    	String actualId=home.vaildateUsername();
    	 String expectedId=mySheet.getRow(1).getCell(0).getStringCellValue();
    	 
    	 	GeneralSSUse.screenshotuse(driver, actualId);
		  
    	 Assert.assertEquals(actualId, expectedId,"actualId and expectedId are Not matched test case is FAIL");
	  }
	  
 
	 
	  @AfterMethod
	  public void logout() throws InterruptedException 
	  {
		  home.logout();
		  
	  }
	
	  @AfterClass
	  public void closeBrowser() 
	  {
		  driver.close();
	  }
	 
	}

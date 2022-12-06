package upStockPOMExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login-v2.upstox.com/");
        File AQ= new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
        Sheet MySheet = WorkbookFactory.create(AQ).getSheet("Sheet2");
      
        LoginPage login=new LoginPage(driver);
        login.enterUserID(MySheet.getRow(0).getCell(0).getStringCellValue());
        login.enterPassword(MySheet.getRow(0).getCell(1).getStringCellValue());
        login.clicksignIn();
        
        

	}

}

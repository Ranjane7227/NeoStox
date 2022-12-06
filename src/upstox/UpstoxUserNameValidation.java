package upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxUserNameValidation 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CLASS SELENIUM\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login-v2.upstox.com/");
        File AQ= new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
        Sheet Sheet = WorkbookFactory.create(AQ).getSheet("Sheet2");
        String userId = Sheet.getRow(0).getCell(0).getStringCellValue();
        String pass= Sheet.getRow(0).getCell(1).getStringCellValue();
        String passcode = Sheet.getRow(0).getCell(2).getStringCellValue();
        String expectedUserName= Sheet.getRow(1).getCell(0).getStringCellValue(); 
       
        driver.findElement(By.name("userId")).sendKeys(userId);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.id("submit-btn")).click();
        
       Thread.sleep(1000);
       


	}

}

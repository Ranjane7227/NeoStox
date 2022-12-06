package utilityUpStock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethods 
{
  public static void screenshot(WebDriver driver , String TCID) throws IOException
  {
	  File refrence = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

      File refrence1 = new File("D:\\SS\\"+TCID+".jpg");
      
      FileHandler.copy(refrence, refrence1);
	  
  }
  public static String excelReading(int row,int cell) throws EncryptedDocumentException, IOException
  {
	  File myFile=new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
	 String AS = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
     return AS;
  }
  public static void dynamicwait(WebDriver driver,int mili)
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(mili));
  }
  public static void scrolling(WebDriver driver,WebElement Name)
  {
	  JavascriptExecutor JS = (JavascriptExecutor)driver;
	  JS.executeScript("arguments[0].scrollIntoView", Name);
  }
}

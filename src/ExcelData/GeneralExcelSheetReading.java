package ExcelData;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class GeneralExcelSheetReading 
{
	public void excelWB(int row,int cell) throws EncryptedDocumentException, IOException
	  {
		  File myFile=new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
		  WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
	  }

}

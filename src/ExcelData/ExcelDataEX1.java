package ExcelData;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataEX1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File AQ= new File("D:\\CLASS SELENIUM\\B43-Sanket Ranjane.xlsx");
	String RefrenceVariable = WorkbookFactory.create(AQ).getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
		System.out.println(RefrenceVariable);
		System.out.println("=========================");
		double RefrenceVariable2 = WorkbookFactory.create(AQ).getSheet("Sheet1").getRow(11).getCell(6).getNumericCellValue();
	   System.out.println(RefrenceVariable2);
	}

}

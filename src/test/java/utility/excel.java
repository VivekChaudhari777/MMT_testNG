package utility;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void ExcelPrint(String Carprice) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\ExcelOutput.xlsx");
		 
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("price");
		XSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue(Carprice);
		//row.createCell(1).setCellValue(errormessage);
		workbook.write(file);
		workbook.close();
		file.close();
	
        
        
        
	}

}

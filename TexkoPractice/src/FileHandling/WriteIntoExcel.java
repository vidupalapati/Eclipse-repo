package FileHandling;
import java.io.*;

import org.apache.poi.xssf.usermodel.*;
public class WriteIntoExcel {

	public static void main(String[] args) throws IOException 
	{
		File src = new File("C:\\Users\\vikas\\JavaPractice\\TexkoPractice\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		
		wb.close();
	}
}

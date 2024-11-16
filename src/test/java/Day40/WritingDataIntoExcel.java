package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File--->Workbook--->Sheets--->Rows----Cells
public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet= workBook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("hello");
		row1.createCell(2).setCellValue(123);
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("selenium");
		row2.createCell(1).setCellValue("java");
		row2.createCell(2).setCellValue(332);
		
		XSSFRow row3 = sheet.createRow(1);
		row3.createCell(0).setCellValue("python");
		row3.createCell(1).setCellValue("selenium");
		row3.createCell(2).setCellValue(123);
		
		workBook.write(file);
		workBook.close();
		file.close();
		

	}

}

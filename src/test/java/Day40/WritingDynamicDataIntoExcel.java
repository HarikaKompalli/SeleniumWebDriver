package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet= workBook.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows ?");
		int noOfRows = sc.nextInt();
		System.out.println("enter no of cells ?");
		int noOfCells = sc.nextInt();
		
		for(int r=0;r<=noOfRows;r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for(int j=0;j<noOfCells;j++) {
				XSSFCell currentCell = currentRow.createCell(j);
				currentCell.setCellValue(sc.next());
			}
		}
		workBook.write(file);
		workBook.close();
		file.close();
		System.out.println("File is creataed.....");
	}

}

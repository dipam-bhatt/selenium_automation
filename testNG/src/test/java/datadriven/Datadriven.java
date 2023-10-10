package datadriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	// indetify testcases colomn by scanning the entire 1st raw
	// once column is identified then scan entire testcase colomn to identify
	// purchase testcase row
	// after you grab purchase testcase row= pull all the data of that row aND FEED
	// INTP TEST
	public static void getData() throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excelsheetreader\\automation.xlsx");
		System.out.println(fis);
		// to read excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println(workbook);
		int sheets = workbook.getNumberOfSheets();
		System.out.println("no of sheets : " + sheets);
		
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("home")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				//identify testcases by scanning the entire 1st row
				Iterator<Row> rows = = sheet.iterator();// sheet is collection of rows
				System.out.println("Rows : ->"+rows);
				Row firstrow = rows.next();
				System.out.println("first row -> "+firstrow);
				Iterator<Cell>ce ce = firstrow.cellIterator();// row is collection of cells
				System.out.println("cell -> "+ce.toString());
				int k = 0;
				int coloumn = 0;
	}
	public static void main(String[] args) throws IOException {
		getData();
	}

	
}
package excel;


	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class excelreader {
		
		public excelreader(String filePath, String sheetName) {
			super ();
			this.filePath = filePath;
		    this.sheetName = sheetName;
		}
		String filePath;
		String sheetName;
		
		public int rowCount() {
			int i =0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filePath);
				XSSFSheet worksheet = workbook.getSheet(sheetName);
				i = worksheet.getPhysicalNumberOfRows();
				System.out.println(i);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return i;
		}
	// for no of columns
		public int colCOunt() {
			int i = 0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filePath);
				XSSFSheet worksheet = workbook.getSheet(sheetName);
				i = worksheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println(i);
			} catch (IOException e) {
	e.printStackTrace();
			}
			return i;
		}
		// for perticular data in cell
		public String getData(int row, int col) {
			String data = null;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filePath);
				XSSFSheet worksheet = workbook.getSheet(sheetName);
				data = worksheet.getRow(row).getCell(col).getStringCellValue();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return data;
		}
	}



package readExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel01 {

	public static void main(String[] args) throws IOException {
		
		//Print All Value From Excel sheet
		
		//Open Workbook-
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		
		//Get Sheet-
		XSSFSheet sheet = wb.getSheet("AA");
		
		//Get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		//open For Loop for Rows
		for (int i = 1; i <= rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			//open For Loop for columns/cell
			for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				String value = cell.getStringCellValue();
				System.out.println(value);
			}//end of columns For Loop
			
		} //end of row For Loop
		
		
	}

}

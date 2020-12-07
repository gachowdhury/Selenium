package readExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Open Workbook-
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		
		//Get Sheet-
		XSSFSheet sheet = wb.getSheet("AA");
		
		//Get Row-
		XSSFRow row = sheet.getRow(3);
		
		//Get Column
		XSSFCell cell = row.getCell(0);
		
		//Action- Read Value
		String value = cell.getStringCellValue();
		System.out.println(value);
			
		
	}

}

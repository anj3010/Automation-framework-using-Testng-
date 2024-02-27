package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath ,String sheetName) {
		try {
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		getRowCount();
//		getCellDataString(0, 0);
//		getCellDataNumber(1,1);
	}
	
	public static void getRowCount() {
		
		try {
			
			int rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
	public static void getCellDataString(int rownum, int colnum) {
		try {
			
			 String cellData =sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			 System.out.println(cellData);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
	}
	public static void getCellDataNumber(int rownum ,int colnum) {
		try {
			 
			 double celldata =sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			 System.out.println(celldata);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

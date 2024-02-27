package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelDataProvider {
	static Workbook book;
    static Sheet sheet;

	public static void openExcel(String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            book = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	 public static int getRowCount(){
	        return sheet.getPhysicalNumberOfRows();
	    }

	    public static int getColsCount(int rowIndex){
	        return sheet.getRow(rowIndex).getPhysicalNumberOfCells();
	    }

    public static void getSheet(String sheetName){
        sheet = book.getSheet(sheetName);
    }
    public static String getCellData(int rowIndex, int colIndex){
        return sheet.getRow(rowIndex).getCell(colIndex).toString();
    }

    public static String excelIntoListMap(String filePath, String sheetName ,int rowIndex ,int colIndex ){
    	String data ;
        openExcel(filePath);
        getSheet(sheetName);

        
        //outer for loop
       
        	
        
            //creating a map fpr every row
		return getCellData(rowIndex,colIndex);
               
    }
	
	
    }


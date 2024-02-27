package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.Test;



public class Excelmethod {
	 
	public String getData1(String sheetName ,int rowIndex ,int colIndex) throws Exception, IOException {
        File file=new File(Constant.FILEPATH);
        FileInputStream fis=new FileInputStream(file);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet(sheetName);
        Row row=sh.getRow(rowIndex);
        String data=row.getCell(colIndex).getStringCellValue();
		return data;
    }
	
	public  void setData() throws EncryptedDocumentException, IOException {
		File file=new File(Constant.FILEPATH);
        FileInputStream fis=new FileInputStream(file);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("sheet2");
        Row row = sh.createRow(1);
        Cell cell = row.createCell(1);

        cell.setCellValue("SoftwareTestingMaterial");
        FileOutputStream fos = new FileOutputStream("D:\\Test.xlsx");
        wb.write(fos);
        fos.close();
        System.out.println("END OF WRITING DATA IN EXCEL");
	}
	 
	 
	 
	 
	

	
	
	

}

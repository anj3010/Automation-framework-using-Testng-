package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
public static WebDriver driver;
	
//@BeforeMethod
//	public void Launchbrowser() {
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	      
//	driver.get("https://www.amazon.in/");
//	
//	}
 public void waitMethod(int seconds) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
// @AfterMethod
//public static void tearDown(){
//   driver.quit();
//}
public static String getdata(String sheetName ,int rowIndex ,int colIndex) throws Exception, IOException {
    File file=new File(Constant.Prod_FILEPATH);
    FileInputStream fis=new FileInputStream(file);
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet(sheetName);
    Row row=sh.getRow(rowIndex);
    String data=row.getCell(colIndex).getStringCellValue();
	return data;
}

//write data on excel sheet
public  void setData(String sheetName ,int rowIndex,int colIndex,String value) throws EncryptedDocumentException, IOException {
	File file=new File(Constant.Prod_FILEPATH);
    FileInputStream fis=new FileInputStream(file);
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet(sheetName);
    Row row = sh.createRow(rowIndex);
    Cell cell = row.createCell(colIndex);

    cell.setCellValue(value);
    
    
    FileOutputStream fos = new FileOutputStream("C:\\Users\\anjalisingh7\\Amon\\excel\\product.xlsx");
    wb.write(fos);
    fos.close();
    
    
}

}

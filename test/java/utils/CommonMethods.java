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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods extends steps.PackageIntiliazer {
	public static WebDriver driver;
	public static WebElement waitExplicit;
	
	@BeforeClass
	public static void openbrowserAndLaunchApplication() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		      
		driver.get("https://www.amazon.in/");
		
		initializeObjects();
		
	}
	//implicit wait
	 public static void waitMethod(int seconds) {
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
 
	 
	//method to send Value
	 public static void sendText(WebElement element, String textToSend) {
	        element.clear();
	        element.sendKeys(textToSend);
	    }
	 
	//explicit wait
	 public static void explicitWait_element(WebElement element) {
		 waitExplicit= new WebDriverWait(driver, Duration.ofSeconds(10))
	     .until(ExpectedConditions.elementToBeClickable(element));
	    }
	 
	 //click operation method
	 public static void click(WebElement element){
	 explicitWait_element(element);
	        element.click();
	    }
	 
	 
	 //provide data
	 public String Data(String filePath, String sheetName,int rowNum,int colNum) {
		 
	        return ExcelDataProvider.excelIntoListMap(filePath,sheetName,rowNum,colNum);
	    }
	 
	 //exceldata
	 public static String getData1(String sheetName ,int rowIndex ,int colIndex) throws Exception, IOException {
	        File file=new File(Constant.FILEPATH);
	        FileInputStream fis=new FileInputStream(file);
	        Workbook wb=WorkbookFactory.create(fis);
	        Sheet sh=wb.getSheet(sheetName);
	        Row row=sh.getRow(rowIndex);
	        String data=row.getCell(colIndex).getStringCellValue();
			return data;
	    }
	 public static String getData2(String sheetName ,int rowIndex ,int colIndex) throws Exception, IOException {
	        File file=new File(Constant.Add_FILEPATH);
	        FileInputStream fis=new FileInputStream(file);
	        Workbook wb=WorkbookFactory.create(fis);
	        Sheet sh=wb.getSheet(sheetName);
	        Row row=sh.getRow(rowIndex);
	        String data=row.getCell(colIndex).getStringCellValue();
			return data;
	    }
	 
	 
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
	 @AfterClass
	 public void tearDown() {
			driver.quit();
			
		}
	 
	    
	 @DataProvider
	    public Object[][] data(){
	        Object[][] loginData = new Object[1][2];
	        loginData[0][0] = "anjali96906@gmail.com";
	        loginData[0][1] = "Singh@30";
//	        loginData[1][0] = "admin";
//	        loginData[1][1] = "Hum@nhrm123";
//	        loginData[2][0] = "admin";
//	        loginData[2][1] = "Hum@nhrm123";
//	        loginData[3][0] = "admin";
//	        loginData[3][1] = "Hum@nhrm123";
	        return loginData;
	    }
	 
	 
	

}

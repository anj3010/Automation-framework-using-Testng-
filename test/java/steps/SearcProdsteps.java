package steps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearcProdsteps extends utils.CommonMethods {
	
	public SearcProdsteps() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchProd() {
		try {
			searchproduct.searchitem.sendKeys("Shoe for women");
			
			
		}
		catch(Exception e) {
			System.out.println("Exception caught" +e.getMessage());
		}
	}
	
    
	public void search_item_btn() {
		click(searchproduct.searchbtn);
	}
    
    
    
    public void item_select() {
    	click(searchproduct.prd);
    }
    
    public void handlechildWindow() {
        String MainWindow = driver.getWindowHandle();
        Set<String> storeAllActiveWindowNames = driver.getWindowHandles();
        Iterator<String> iterateThroughAllWindows = storeAllActiveWindowNames.iterator();

        while (iterateThroughAllWindows.hasNext()) {
              String ChildWindow = iterateThroughAllWindows.next();
              if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                  driver.switchTo().window(ChildWindow);
               }
           }
    }
    
    
    
    public void verify_item() {
    	  SoftAssert soft = new SoftAssert();
	        String prdname = searchproduct.productname.getText();
	        System.out.println(prdname);
	        soft.assertEquals(prdname, "CULTSPORT Firebird Women Running Shoe");
    }
    
    
    
    public void add_item_cart() {
    	click(searchproduct.cartbtn);
    }
    
    public void cart_item() {
    	click(searchproduct.cartoption);
    }
    
    public void checkbox_option() {
    	if(!searchproduct.checkButton.isSelected()){
    		click(searchproduct.checkButton);
        }
        else{
            System.out.println("The check button is already selected");
        }
    }
    
    public void select_no_of_item() {
    	click(searchproduct.qty);
    }
    
    public void qty_selectet() {
    	click(searchproduct.quantity);
    }
    
    public void payement_button() {
    	click(searchproduct.paymentoption);
    }
    
    public void verify_address_option() {
    	SoftAssert soft = new SoftAssert();
    	 String actual1 ="Add a new address";
         String expected1 = searchproduct.address.getText();
         System.out.println(expected1);
         soft.assertEquals(actual1,expected1);
         click(searchproduct.address);
         
    }

}

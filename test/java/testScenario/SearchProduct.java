package testScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProduct extends utils.CommonMethods {
	@Test()
	public void Searchitem() {
		 
	        address.dropmenu.click();
	        waitMethod(10);
		
	        
	        
	        //search The item 
	        
	        searchproduct.searchitem.sendKeys("shoes for women");
	        waitMethod(10);
	       
	        searchproduct.searchbtn.click();
	        waitMethod(10);
	        
	        
	        
	        driver.get("https://www.amazon.in/CULTSPORT-Firebird-Women-Running-Shoe_CS601073UK6_Rose/dp/B09Q6DV3YR/ref=sr_1_3_sspa?crid=2L0BNH3FL9C4C&keywords=shoes%2Bfor%2Bwomen&qid=1673442027&sprefix=shoes%2Caps%2C299&sr=8-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1&psc=1");
	        
	        //Assertion for same product
	        SoftAssert soft = new SoftAssert();
	        String prdname = searchproduct.productname.getText();
	        System.out.println(prdname);
	        soft.assertEquals(prdname, "CULTSPORT Firebird Women Running Shoe");
	        
	        //Add to cart
	        
	        searchproduct.cartbtn.click();
	        waitMethod(10);
	        
	        //count the cart item
	       
	        searchproduct.cartoption.click();
	        
	        //check the selected item
	        
	        if(!searchproduct.checkButton.isSelected()){
	            searchproduct.checkButton.click();
	        }
	        else{
	            System.out.println("The check button is already selected");
	        }
	        
	        //set the quantity of item 
	       
	        searchproduct.qty.click();
//	      
	        searchproduct.quantity.click();
	        
	        //Proceed to pay 
	        
	        searchproduct.paymentoption.click();
	        
	        //Add new address
	        
	       
	        
	        String actual1 ="Add a new address";
	        String expected1 = searchproduct.address.getText();
	        System.out.println(expected1);
	        soft.assertEquals(actual1,expected1);
	        
	        searchproduct.address.click();
	        }
	


}

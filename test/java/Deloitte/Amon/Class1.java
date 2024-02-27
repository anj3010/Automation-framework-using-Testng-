package Deloitte.Amon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Class1 extends utils.Common {
	
	@Test
	 public void Login(){

		waitMethod(10);
        WebElement signin = driver.findElement(By.id("nav-link-accountList"));
        signin.click();
        //Enter mail id &phone
        
        waitMethod(10);
        WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("anjali96906@gmail.com");
        WebElement nextbtn = driver.findElement(By.id("continue"));
        nextbtn.click();
        waitMethod(10);
        
        //Enter pswd
        WebElement pswdField = driver.findElement(By.id("ap_password"));
        pswdField.sendKeys("Singh@30");
        WebElement signintxt = driver.findElement(By.id("auth-signin-button-announce"));
        
        
        //Assertion Sign in
        SoftAssert soft = new SoftAssert();
      String actual ="Sign in";
        String expected = signintxt.getText();
        System.out.println(expected);
        soft.assertEquals(actual,expected); 
        waitMethod(10);
        
        // logged 
        WebElement signinbtn = driver.findElement(By.id("signInSubmit"));
        signinbtn.click();
        waitMethod(10);
        
        
        WebElement dropmenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span/span"));
        dropmenu.click();
        waitMethod(10);
	
        
        
        //search The item 
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes for women");
        
        WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
        searchbtn.click();
        waitMethod(10);
        
        driver.get("https://www.amazon.in/CULTSPORT-Firebird-Women-Running-Shoe_CS601073UK6_Rose/dp/B09Q6DV3YR/ref=sr_1_3_sspa?crid=2L0BNH3FL9C4C&keywords=shoes%2Bfor%2Bwomen&qid=1673442027&sprefix=shoes%2Caps%2C299&sr=8-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1&psc=1");
        
        //Assertion for same product
        
        String prdname = driver.findElement(By.id("productTitle")).getText();
        System.out.println(prdname);
        soft.assertEquals(prdname, "CULTSPORT Firebird Women Running Shoe");
        
        //Add to cart
        WebElement cartbtn = driver.findElement(By.id("add-to-cart-button"));
        cartbtn.click();
        waitMethod(10);
        
        //count the cart item
        WebElement cartoption = driver.findElement(By.xpath("//a[@id='nav-cart']"));
        cartoption.click();
        
        //check the selected item
        WebElement checkButton = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if(!checkButton.isSelected()){
            checkButton.click();
        }
        else{
            System.out.println("The check button is already selected");
        }
        
        //set the quantity of item 
        WebElement qty = driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']"));
        qty.click();
//      
        WebElement quantity = driver.findElement(By.xpath("//a[@id='quantity_1']"));
        quantity.click();
        
        //Proceed to pay 
        
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        
        //Add new address
        
        WebElement address = driver.findElement(By.id("add-new-address-popover-link"));
        
        String actual1 ="Add a new address";
        String expected1 = address.getText();
        System.out.println(expected1);
        soft.assertEquals(actual1,expected1);
        
        address.click();
        }
        
        

        
        
        
        	
        	
        
        
        
        
        
        
        
        
        
        







    
}

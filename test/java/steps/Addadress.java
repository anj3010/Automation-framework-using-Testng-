package steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Addadress extends utils.CommonMethods {
	
	public void selectaddress() {
		click(address.dropmenu);
	}
	
	public void optionaddresses() {
		click(address.address_option);
	}
	
	public void addAddress() {
		click(address.add_address_option);
	}

       public void country_select() {
		click(address.country_region);
	}
       
       public void Full_Name(String FullName) {
   		
    	   sendText(address.Fullname,FullName);
  
       }
       
       
	
//	public void country_menu() {
//		
//		Select s1 = new Select(address.country_region_value);
//        s1.selectByVisibleText("India");
//	}
       public void Contact_number(String MobileNumber) {
    	   sendText(address.mobile_number,MobileNumber);
 
      }
       
       public void Postal_code(String Pincode) {
    	   sendText(address.pin_code,Pincode);
 
      }
       public void Apartment_no(String Houseno) {	
    	   sendText(address.apartment_no,Houseno);
 
      }
       
       public void street_name(String Area) {
    	   sendText(address.street_name,Area);
 
      }
       
       public void Landmark(String Landmark) {
    	   sendText(address.Landmark,Landmark);
 
      }
       public void city_name(String Town) {
      		
    	   sendText(address.city_name,Town);
 
      }
       public void state_name() {
    	   click(address.state);
  			
 
      }
       
       public void address_type() {
      		
    	   click(address.address_type);
 
      }
       public void select_address_type() {
    	   click(address.select_address_type);
       }
       public void new_address() {
    	   click(address.adding_address);
      		
 
      }

	
	
	
	

}

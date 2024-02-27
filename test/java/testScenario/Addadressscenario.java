package testScenario;

import java.io.IOException;

import org.testng.annotations.Test;

public class Addadressscenario extends utils.CommonMethods {
	
	@Test(enabled=true)
	public static void Newaddress() throws IOException, Exception {
		Loginmethod.login();
		addnewaddress.selectaddress();
		addnewaddress.optionaddresses();
		addnewaddress.addAddress();
//		addnewaddress.country_select();
//		addnewaddress.country_menu();
		addnewaddress.Full_Name(getData2("newaddress", 1,0));
		addnewaddress.Contact_number(getData2("newaddress", 1,1));
		addnewaddress.Postal_code(getData2("newaddress", 1,2));
		addnewaddress.Apartment_no(getData2("newaddress", 1,3));
		addnewaddress.street_name(getData2("newaddress", 1,4));
		addnewaddress.Landmark(getData2("newaddress", 1,5));
		addnewaddress.city_name(getData2("newaddress", 1,6));
		addnewaddress.address_type();
		addnewaddress.select_address_type();
		addnewaddress.new_address();
		
		
	}

}

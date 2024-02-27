package testScenario;

import java.io.IOException;

import org.testng.annotations.Test;

public class Searchscenario extends utils.CommonMethods {
	
	
	@Test
	public  void search_product_method() throws IOException, Exception {
//		Loginscenario.login_method("anjali96906@gmail.com", "Singh@30");
		Loginmethod.login();
		searchsteps.searchProd();
		searchsteps.search_item_btn();
		searchsteps.item_select();
		searchsteps.handlechildWindow();
		searchsteps.verify_item();
		searchsteps.add_item_cart();
		searchsteps.cart_item();
		searchsteps.checkbox_option();
		searchsteps.select_no_of_item();
		searchsteps.qty_selectet();
		searchsteps.payement_button();
		searchsteps.verify_address_option();
	}
	

}

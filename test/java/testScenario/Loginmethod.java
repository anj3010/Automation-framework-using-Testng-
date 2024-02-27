package testScenario;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.Constant;

public class Loginmethod extends utils.CommonMethods{
	
	@Test(enabled=true)
	public static void login(  ) throws IOException, Exception {

		loginsteps.open_homepage();
		
		loginsteps.valid_username(getData1("sheet1", 1,0));
		loginsteps.user_click_continue();
		loginsteps.valid_pswd(getData1("sheet1",1,1));
		loginsteps.assertion();
		loginsteps.click_signin_button();
	
	}
	

}

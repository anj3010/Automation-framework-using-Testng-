package testScenario;

import org.testng.annotations.Test;

public class Loginscenario extends utils.CommonMethods {
	
	@Test(dataProvider ="data",dataProviderClass=utils.Excelprovider.class)
	
	public static void login_method(String username ,String Password) {
		System.out.println(username +" " +Password);
			loginsteps.open_homepage();
			loginsteps.valid_username( username);
			loginsteps.user_click_continue();
			loginsteps.valid_pswd(Password);
			loginsteps.assertion();
			loginsteps.click_signin_button();
		

	}

}

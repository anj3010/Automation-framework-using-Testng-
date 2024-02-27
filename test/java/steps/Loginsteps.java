package steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Constant;

public class Loginsteps extends utils.CommonMethods {
//	
	public  Loginsteps() {
		PageFactory.initElements(driver, this);
	}
	
	public void open_homepage() {
		
		click(login.signin);
		
	}
	
	public void valid_username(String username) {
		 sendText(login.usernameField,username);
	 }
	 
	
	  
	 
	 
	 public void user_click_continue() {
		 click(login.nextbtn);
	 }
	 
	 
	 public void valid_pswd(String Password) {
		 sendText(login.pswdField,Password);
	 }
	
	 public void assertion() {
		 SoftAssert soft = new SoftAssert();
	     String actual ="Sign in";
	       String expected = login.signintxt.getText();
	       System.out.println(expected);
	       soft.assertEquals(actual,expected); ;
	       waitMethod(10);
	 }
	 
	 
	 public void click_signin_button() {
		 click(login.signinbtn);
	 }
	 

}

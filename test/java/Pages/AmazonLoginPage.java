package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonLoginPage extends utils.CommonMethods {
	
	@FindBy(id="nav-link-accountList")
	public WebElement signin ;
	
	
	@FindBy(id="ap_email")
	public WebElement usernameField;
	
	@FindBy(id="continue")
	public WebElement nextbtn;
	
	@FindBy(id="ap_password")
	public WebElement pswdField;
	
	@FindBy(id="auth-signin-button-announce")
	public WebElement signintxt;
	
	@FindBy(id="signInSubmit")
	 public WebElement signinbtn;
	
	
	public AmazonLoginPage(){
        PageFactory.initElements(driver, this);
    }
	
	
	
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonSearchPage  extends utils.CommonMethods{
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchitem;
	
	
	@FindBy(id="nav-search-submit-button")
	public WebElement searchbtn;
	
	@FindBy(xpath="//span[contains(text(), 'Womens Sherry Running Shoe')]")
	public WebElement prd;
	
	
	@FindBy(id="productTitle")
	public WebElement productname;
	
	
	@FindBy(id="add-to-cart-button")
	public WebElement cartbtn;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	public WebElement cartoption;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkButton;
	
	@FindBy(xpath="//span[@data-action='a-dropdown-button']")
	public WebElement qty;
	
	
	@FindBy(xpath="//a[@id='quantity_1']")
	public WebElement quantity;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	public WebElement paymentoption;
	
	
	@FindBy(id="add-new-address-popover-link")
	public WebElement address;
	
	
	public AmazonSearchPage(){
        PageFactory.initElements(driver, this);
    }

}

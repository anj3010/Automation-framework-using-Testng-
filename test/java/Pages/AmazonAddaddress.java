package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddaddress extends utils.CommonMethods {
	@FindBy(xpath="//a[@id='nav-link-accountList']/span/span")
	public WebElement dropmenu;
	
	
	@FindBy(xpath="//img[@alt='Your Addresses']")
	public WebElement address_option;
	
	@FindBy(xpath="//h2[text()='Add address']")
	public WebElement add_address_option;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-countryCode']/span")
	public WebElement country_region;
	
	@FindBy(xpath="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li/a")
	public WebElement country_region_value;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	public WebElement Fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	public WebElement mobile_number;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	public WebElement pin_code;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	public WebElement apartment_no;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	public WebElement street_name;
	
	@FindBy(id="address-ui-widgets-landmark")
	public WebElement Landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	public WebElement city_name;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-enterAddressStateOrRegion']/span")
	public WebElement state;
	
	@FindBy(xpath=" //span[contains(@id,'and-business-hours')]")
	public WebElement address_type;
	
	@FindBy(xpath=" //a[contains(text(),' Home (7 am – 9 pm delivery) ')]")
	public WebElement select_address_type;
	
	@FindBy(xpath=" //span[contains(@id,'address-ui-widgets-form')]/span/input")
	public WebElement adding_address;
	
	
	
	
	public AmazonAddaddress() {
		PageFactory.initElements(driver, this);
	}

}

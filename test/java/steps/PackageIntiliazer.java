package steps;

import Pages.AmazonAddaddress;
import Pages.AmazonLoginPage;
import Pages.AmazonSearchPage;

public class PackageIntiliazer  {
	
	public static AmazonLoginPage login;
	public static AmazonSearchPage searchproduct;
	public static AmazonAddaddress address;
	
	//steps
	public static Loginsteps loginsteps;
	public static SearcProdsteps searchsteps;
	public static Addadress  addnewaddress;
	
	public static void initializeObjects(){
        login = new AmazonLoginPage();
        searchproduct = new AmazonSearchPage();
        address = new AmazonAddaddress();
        
        loginsteps = new Loginsteps();
        
        searchsteps =new SearcProdsteps();
        
        addnewaddress = new Addadress();
	
	}
}

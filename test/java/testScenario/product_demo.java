package testScenario;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class product_demo extends utils.Common {
	
	@Test
	public void test1() throws Exception {
		
		System.out.println(getdata("one",1,0));
		
		setData("one",3,0,"Cloth");
		
	}
	
	
	

}

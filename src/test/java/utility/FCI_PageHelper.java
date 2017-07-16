package utility;

import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.PLPPage;

public class FCI_PageHelper {
	
	public HomePage homePage(){
		return  new HomePage();
	}
	public PLPPage plpPage(){
		return new PLPPage();
	}
	

}

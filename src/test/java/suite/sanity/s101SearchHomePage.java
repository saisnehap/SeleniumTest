package suite.sanity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.FCI_PageHelper;
import utility.FCI_PageImplementer;
import utility.FCI_TestConfig;

@Listeners(utility.FCI_Listener.class)
public class s101SearchHomePage extends FCI_PageImplementer{
	
	
	@Test
	public void s101SearchHomePageTest(){

		obj.homePage().mCloseHomeScreenPopup();
		
	}

}

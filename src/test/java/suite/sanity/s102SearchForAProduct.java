package suite.sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.FCI_Assert;
import utility.FCI_PageHelper;
import utility.FCI_PageImplementer;
import utility.FCI_TestConfig;
@Listeners(utility.FCI_Listener.class)
public class s102SearchForAProduct extends FCI_PageImplementer{
  @Test
  public void s102SearchForAProductTest() {
	  obj.homePage().mEnterSearchProduct();

	  
  }
}

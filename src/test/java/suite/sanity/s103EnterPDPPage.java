package suite.sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.FCI_ExcelUtils;
import utility.FCI_PageHelper;
import utility.FCI_PageImplementer;
@Listeners(utility.FCI_Listener.class)
public class s103EnterPDPPage extends FCI_PageImplementer{
  @Test
  public void s103EnterPDPPageTest() {
	  String value = "";
	  try {
	 value = FCI_ExcelUtils.getCellData(1, 0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  obj.homePage().mEnterSearchProduct(value);
	  obj.plpPage().mClickOnProductImage();
  }
}

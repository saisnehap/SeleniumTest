package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.FCI_PageImplementer;
import utility.FCI_TestConfig;

public class PLPPage extends FCI_PageImplementer{
	WebDriver driver = FCI_TestConfig.getDriver();
	
	WebElement productImage(){
		return driver.findElement(By.className("prodImg"));
	}
	
	public void mClickOnProductImage(){
		productImage().click();
	}

}

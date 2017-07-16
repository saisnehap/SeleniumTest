package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.FCI_Assert;
import utility.FCI_PageHelper;
import utility.FCI_PageImplementer;
import utility.FCI_TestConfig;

public class HomePage extends FCI_PageImplementer{
	
WebDriver driver = FCI_TestConfig.getDriver();

WebElement homeScreenPopup(){
	try{
		return driver.findElement(By.xpath("//div[@class='lightbox']"));
		}
		catch(Exception e){
			return null;
			}
	
}
WebElement homeScreenPopupCloseButton(){
	return driver.findElement(By.className("closebtn"));
}
WebElement searchInput(){
	return driver.findElement(By.id("searchFormInput"));
}
WebElement searchButton(){
	return driver.findElement(By.className("searchFormButton"));
}

public void mCloseHomeScreenPopup(){
	if(homeScreenPopup()!=null && homeScreenPopup().isDisplayed())
		homeScreenPopupCloseButton().click();
	System.out.println("printing....");
	
}
public void mEnterSearchProduct(){
	searchInput().sendKeys("Crusinart");

}
public void mEnterSearchProduct(String productId){
	searchInput().clear();
	searchInput().sendKeys(productId);
	searchButton().click();
}

}

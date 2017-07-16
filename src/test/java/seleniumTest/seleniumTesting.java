package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class seleniumTesting {
	WebDriver driver = new FirefoxDriver();
	@Test
	public void m(){
		driver.get("https://www.google.com");
	}

}

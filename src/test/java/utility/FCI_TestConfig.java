package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FCI_TestConfig {
	 static Properties properties = getConfigProperties(); 
//	protected static WebDriver driver=initiateDriver();
	protected static WebDriver driver;
	
	public static Properties getConfigProperties(){
		Properties properties = new Properties();
		
		try{
			
		File file = new File("config.properties");
		FileInputStream fis = new FileInputStream(file);
		
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return properties;
	}
	public static WebDriver initiateDriver(){
		WebDriver driver;
		
//			Properties p = getConfigProperties();
			if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
				driver = new FirefoxDriver();
			else if(properties.getProperty("browser").equalsIgnoreCase("ie"))
				driver = new InternetExplorerDriver();
			else if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else
				driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FCI_TestConfig.driver = driver;
		return driver;
	}
	public static WebDriver getDriver(){
		
		return driver;
	}
	
	public static void mLaunchConcept(){
//		Properties p = getConfigProperties();
		driver.get(properties.getProperty("URL"));
	}

}

package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

		// Method that returns a WebDriver object
	
	public static WebDriver open(String browserType) {
		
		if (browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Mike_F\\Downloads\\geckodriver.exe");
			 return new FirefoxDriver();
			
		} else if (browserType.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver" , "C:\\Users\\Mike_F\\Downloads\\MicrosoftWebDriver.exe");
			return new EdgeDriver();
		} else { 
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike_F\\Downloads\\chromedriver.exe");
			 return new ChromeDriver();
			 
		}
		
	}
} 
package smokeTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TitlePageJUnit {
	WebDriver driver; 
	@Test
	public void TitlePageTest(){
		System.out.println("Running test.");

		String webUrl = "file:///C:/Users/Mike_F/Desktop/Master%20Folder/HTML%20&%20Styles/Register%20template.html";
		
		driver.get(webUrl);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Form Template Raw HTML";
		Assert.assertEquals(expectedTitle,actualTitle);
		//Assert.fail("intentional failure.");
	}
	@Before
	public void setUp(){
		System.out.println("Setting up test.");
		System.out.println("Initializing driver.");
		driver= utilities.DriverFactory.open("chrome");


		
	}
	@After
	public void closeTest(){
		System.out.println("Closing Test.");
		System.out.println("Closing Driver.");


		
	}
	
}

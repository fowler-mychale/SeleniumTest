package SeleniumTrainng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {


		public static void main(String[]args) throws InterruptedException {
			
			String browserType = "chrome";
			String firstName = "Mychale" ;
			String lastName = "Fowler";
			String gender = "female";
			String email = "email@example.com";
			String password = "okay123";
			String birthday = "March";
			String agree; // each check box requires its own string variable
			

			// Define WebDriver
			WebDriver driver;
			driver = utilities.DriverFactory.open(browserType);
			
			//2. Navigate to application
			driver.get("file:///C:/Users/Mike_F/Desktop/Master%20Folder/HTML%20&%20Styles/Register%20template.html");
			
			// Define WebElement
			WebElement fnameElement = driver.findElement(By.name("firstname"));
			WebElement lnameElement = driver.findElement(By.name("lastname"));
			WebElement emailElement = driver.findElement(By.name("email"));
			WebElement passwordElement = driver.findElement(By.name("password"));
			WebElement termsElement = driver.findElement(By.xpath("/html/body/form/div/label/input"));
			WebElement maleRadio = 	driver.findElement(By.id("male"));
			WebElement femaleRadio = driver.findElement(By.id("female"));
			WebElement submitElement = driver.findElement(By.id("submit"));
			
			
			//3. Get the page title
			String pageTitle = driver.getTitle();
			System.out.println("Title is: " + pageTitle);
			
			//4.Enter first name
			fnameElement.sendKeys(firstName);
			
		
			//5. Enter last name
			lnameElement.sendKeys(lastName);
			
		
		
			// if else handles gender buttons
			if (gender.equalsIgnoreCase("male")) {
				
				maleRadio.click();
			}
			else { 
				femaleRadio.click();
				}
			
			
			
			//7. Type in email
			emailElement.sendKeys(email);
			
			//8. Type in password
			passwordElement.sendKeys(password);
			
			//9. Select date of birth
			
			//new Select(driver.findElement(By.name("Birthday"))).selectByVisibleText(birthday);
			
			//option.deselectByIndex(0);
			
			//9.Agree to terms check box
			termsElement.click();
			
			submitElement.click();
			
			//9. Get confirmation
			String message = driver.findElement(By.id("submitBtn")).getText();
			String expected = "Hello World";
			if (message.contains(expected)) {
				System.out.println("Confirmation : " + message);
				
			} else {
				
				System.out.println("Failed" );
				
			}
			
		
			Thread.sleep(2000);

			
			//10. Close browser
			driver.close();
		}
	
}
	//linkText is for<a> tags


package SeleniumTrainng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[]args) throws InterruptedException {
		
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike_F\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//2. Navigate to application
		//http://sdettraining.com/login.html
		driver.get("file:///C:/Users/Mike_F/Desktop/Master%20Folder/HTML%20&%20Styles/Register%20template.html");
		//3. Get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Title is: " + pageTitle);
		
		//4.Enter first name
		//driver.findElement(By.name("signIn")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mychale");
		
		// Find elements: Locate the element, Determine the action, Pass all parameters
		//5. Enter last name
		driver.findElement(By.name("lastname")).sendKeys("Fowler");
		
		//6. Enter password
		//driver.findElement(By.id("male")).click();
		WebElement radioClick = driver.findElement(By.id("female"));
		radioClick.click();
		
		//7. Type in email
		driver.findElement(By.name("email")).sendKeys("Kels951@gmail.com");
		driver.findElement(By.name("password")).sendKeys("haha");
		
		//8. Select date of birth
		
		Select option = new Select(driver.findElement(By.name("Birthday")));
		option.selectByVisibleText("March");
		option.selectByVisibleText("April");
		//option.deselectByIndex(0);
		
		//9.Agree to terms checkbox
		driver.findElement(By.xpath("/html/body/form/div/label/input")).click();
		
		
		
		//9. Get confirmation
		String message = driver.findElement(By.id("submitBtn")).getText();
		System.out.println("Confirmation" + message);
		
		Thread.sleep(2000);

		
		//10. Close browser
		driver.close();
	}
}

//linkText is for<a> tags
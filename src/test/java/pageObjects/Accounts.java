package pageObjects;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accounts extends Common {

	
	public static void fnLandingPage() throws InterruptedException, ParseException, IOException {
		String os= "ubuntu";
		
		if(os.equalsIgnoreCase("windows")) {
		System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
		}
		else if(os.equalsIgnoreCase("ubuntu")) {
			System.setProperty("webdriver.chrome.driver","./lib/chromedriver_linux");
		}
		driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		Thread.sleep(5000);
		fnTakeScreenshot("Landing page");
		fnWriteLogs("Url accessed. url is https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}

	public static void fnEnterUsernamePassword() throws ParseException, IOException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("chetan");
		fnWriteLogs("Username entered");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Temp@123");
		fnWriteLogs("Password entered");
		fnTakeScreenshot("Username and password entered");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		fnWriteLogs("Clicked on Log in button");
		}
	
	public static void fnVerifyDashboardPage() throws InterruptedException, ParseException, IOException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h1[text()='Accounts Overview']")).isDisplayed();
		fnTakeScreenshot("Home page");
		fnWriteLogs("Accounts overview header is displayed. user successfully lands on home page.");
	}
	
}

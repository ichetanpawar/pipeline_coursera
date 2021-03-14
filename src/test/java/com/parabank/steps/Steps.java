package com.parabank.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.parabank.base.BaseUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseUtil {
	private WebDriver driver;

	private BaseUtil baseutil;

	public Steps(BaseUtil util) {

		this.baseutil = util;
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\env\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("I am in the login page of the ParaBank")
	public void i_am_in_the_login_page_of_the_ParaBank() {

		driver.get("http://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}

	@When("I enter valid {string} and {string} with {string}")
	public void i_enter_valid_credential(String username, String password, String username1) throws InterruptedException {
		
		baseutil.userFullName = username1;
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);

	}

	@Then("I should be navigate  to the overview page")
	public void i_should_be_navigate_to_the_overview_page() throws InterruptedException {
		Thread.sleep(2000);
		String actualName=driver.findElement(By.xpath("//p[@class='smallText']")).getText().toString();
		System.out.println(baseutil.userFullName.toString());
		
		assertTrue(actualName, actualName.contains(baseutil.userFullName));
		driver.findElement(By.id("rightPanel")).isDisplayed();
		driver.findElement(By.linkText("Log Out")).click();
	}

	@After
	public void teardown() {
		driver.quit();
	}
}

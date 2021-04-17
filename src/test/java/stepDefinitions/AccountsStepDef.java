package stepDefinitions;

import java.io.IOException;
import java.text.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts;
import pageObjects.Common;

public class AccountsStepDef extends Accounts {

	@Given("User is landing on login page {string}")
	public void user_is_landing_on_login_page(String TCID) throws InterruptedException, ParseException, IOException {
		fnLandingPage();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws ParseException, IOException {
		fnEnterUsernamePassword();
	}

	@Then("User verifies home page view")
	public void user_verifies_home_page_view() throws InterruptedException, ParseException, IOException {
		fnVerifyDashboardPage();
	}

	@Then("User closes browser session")
	public void user_closes_browser_session() {
		fnCloseBrowser();
	}

}

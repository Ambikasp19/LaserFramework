package stepdefinitions;

import java.util.Properties;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {


	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	@Given("user is on Login page")
	public void user_is_on_home_page() 
	{
		homePage.Verify_homePage();
		
	}
	@When("User Enter UserName")
	public void user_enter_user_name() throws InterruptedException {
		
		configReader = new ConfigReader();
		prop =configReader.init_prop();
		String UserName= prop.getProperty("username");
		
		homePage.EnterUsername(UserName);
	  
	}

	@When("User Enter Password")
	public void user_enter_password() {
		String Password= prop.getProperty("password");
		homePage.EnterPassword(Password);
	    
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
		homePage.submit();
	}

	@Then("I should see ChooseAccount Screen")
	public void i_should_see_choose_account_screen() 
	{
		
		System.out.println("ï am on chosse account screen");
	}

	@When("User click on ChooseAccount Radio Button")
	public void user_click_on_choose_account_radio_button() 
	{
		homePage.ClickonRadioButton();
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		
		homePage.ClickoncontinueButton();
	}

	@Then("I should see Setup Account Screen")
	public void i_should_see_setup_account_screen() 
	{
		homePage.Dropdown();
	}

}

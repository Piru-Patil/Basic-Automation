package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_net_banking_landing_page() {
	   System.out.println("User is on netbanking landing page");
	}
	
	@Given("^User is on Practice landing page$")
	public void user_is_on_practice_landing_page() {
		System.out.println("USer is on Practicce landing page");
		Assert.assertTrue(false);
	}
	
	@When("^user signup into application$")
	public void user_signup_into_application(List<String> data) {
	   
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	@When("^user login to the application with (.+) and password (.+)$")
	public void user_login_to_the_application_with_and_password(String username, String password) {
		System.out.println(username +" and password is "+ password );
	    
	}
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() {
	    System.out.println("home page is displayed");
	}
	
	@Then("^Cards are displayed$")
	public void cards_are_displayed() {
	   System.out.println("cards are displayed");
	}
	
	@Given("^set up the entries in database$")
	public void set_up_the_entries_in_database() {
		System.out.println("***********************");
		System.out.println("set up the entries in database");
	}
	
	@When("^launch the browser from config variables$")
	public void launch_the_browser_from_config_variables() {
		System.out.println("launch the browser from config variables");
	}
	
	@And("^hit the home page url of banking site$")
	public void hit_the_home_page_url_of_banking_page() {
		System.out.println("hit the home page url of banking site");
	}


}

package com.DEW.DEWAutomation.atdd.stepdefinitions;

import java.util.List;

import com.DEW.DEWAutomationSuite.atdd.Testpage1.DriverFactory;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.Homelogin;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.WellPermitPage;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.GoogleloginTestonly ;
import io.cucumber.java.PendingException;
//import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//import com.DEW.DEWAutomation.stepDefinitions.Home;

public class PageLayoutStepDefinition extends DriverFactory {
	
	
	
	Homelogin homelogin;
	WellPermitPage wellpermitpage ;
	GoogleloginTestonly googlelogin;
	
	public PageLayoutStepDefinition()
	{
		homelogin = new Homelogin();
		wellpermitpage  = new WellPermitPage ();
		googlelogin = new GoogleloginTestonly();
;
	}
	
	@Given("User launch the Access my water homepage")
	public void user_launch_the_Access_my_water_homepage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   homelogin.LaunchAppUrl();
	}
	@When("User should login with valid username and password")
	public void user_should_login_with_valid_username_and_password() throws Exception {
		homelogin.LoginApp();
		
	}
	@Then("I can see home page successfully")
	public void i_can_see_home_page_successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		homelogin.LoginSuccessful();
	}
	@When("User click on Start New Application")
	public void user_click_on_start_new_application() throws Exception {
		wellpermitpage.ClickOnStartNewApplication();

	  
	}
	@When("User click on Water Affecting Activity Permits")
	public void user_click_on_water_affecting_activity_permits() throws Exception {
	    wellpermitpage.ClickOnWaterAffectingActivityPermits();
	    
	  
	}
	@When("User click on Well Construction Permit Application")
	public void user_click_on_well_construction_permit_application() throws Exception {
		wellpermitpage.user_click_on_well_construction_permit_applications();
	 
	}
	@When("User click on Continue Application")
	public void user_click_on_continue_application() throws Exception {
	    wellpermitpage.ClickonContinueApplication();
	
	}
	@When("User click on Add new button")
	public void user_click_on_add_new_button() throws Exception {
		wellpermitpage.ClickOnAddNewButton();
	}
	@When("User fill the contact information page")
	public void user_fill_the_contact_information_page() throws Exception {
	    wellpermitpage.FillTheContactInformationPage();
	    
	}
	@When("User Selects the proposed work")
	public void user_selects_the_proposed_work() throws Exception {
	  wellpermitpage.SelectTheProsedWork();

	}
	@Then("User selects the location details and water supply type of well")
	public void user_selects_the_location_details_and_water_supply_type_of_well() throws Exception{
		  wellpermitpage.SelectLocation_details_water_supply();
	   
	}
	@Then("User add attachment and reviews to record type")
	public void user_add_attachment_and_reviews_to_record_type() throws Exception {
	   wellpermitpage.add_attachment_and_reviews_to_record_type();
	    
	}
	@Then("User pays the fees and click on next")
	public void user_pays_the_fees_and_click_on_next() throws Exception {
	    wellpermitpage.PayFees();
	    
	}
	@Then("User has successfully submit the application")
	public void user_has_successfully_submit_the_application() throws Exception {
		wellpermitpage.SuccessfullySubmitApplication();
	   
	}	
	@Given("User launch the Google homepage")
	public void user_launch_the_google_homepage() throws Exception{
		googlelogin.LaunchAppUrl();
	 
	}
	@When("User search any keyword")
	public void user_search_any_keyword() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		googlelogin.SearchKeyword();
	 
	}
	@Then("I can see results page successfully")
	public void i_can_see_results_page_successfully()  throws Exception{
		googlelogin.LoginSuccessful();
	    
	}


}
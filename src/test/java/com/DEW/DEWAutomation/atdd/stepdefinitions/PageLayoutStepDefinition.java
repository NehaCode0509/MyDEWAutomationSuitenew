package com.DEW.DEWAutomation.atdd.stepdefinitions;

import java.util.List;


import com.DEW.DEWAutomationSuite.atdd.Testpage1.Homelogin;

import io.cucumber.java.PendingException;
//import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//import com.DEW.DEWAutomation.stepDefinitions.Home;

public class PageLayoutStepDefinition {
	
	Homelogin homelogin ;

	public PageLayoutStepDefinition()
	{
		homelogin = new Homelogin();
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
	

}
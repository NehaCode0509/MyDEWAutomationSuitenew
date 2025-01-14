package com.DEW.DEWAutomationSuite.atdd.testrunner;



	import org.junit.runner.RunWith;
	//import cucumber.api.CucumberOptions;
	//import cucumber.api.junit.Cucumber;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/functional", 
	glue = { "com.DEW.DEWAutomation.atdd.stepdefinitions", },
	dryRun = false,
	plugin = { "pretty","json:target/cucumber-reports.json" }, 
	monochrome = true,
	tags = "@GoogleTest ")
	 
	public class TestRunner {
		

	    /*
	    * This class should be empty, step definitions should be in separate classes.
	    */
	}
	
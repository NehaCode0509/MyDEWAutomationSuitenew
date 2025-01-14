@GoogleTest @Regression
Feature: Google Search
  As a user, I want to open Google homepage and verify its title.

  Scenario Outline: Verify Google homepage title
    Given User launch the Google homepage
    When User search any keyword
    Then I can see results page successfully
    
    
       ##  | surendra.singh@sa./gov.au | sambroo |
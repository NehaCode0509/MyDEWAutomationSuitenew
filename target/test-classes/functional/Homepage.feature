@Login @Regression
Feature: DEWWater Search
  As a user, I want to open DEW Access homepage and verify its title.

  Scenario Outline: Verify DEW homepage title
    Given User launch the Access my water homepage
    When User should login with valid username and password
    Then I can see home page successfully
    
       ##  | surendra.singh@sa./gov.au | sambroo |
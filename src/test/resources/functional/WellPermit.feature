@WellPermit @Regression
Feature: New Application for Well Permit

  Scenario Outline: As a user, I want to open new application for Well Permit
    Given User launch the Access my water homepage
    When User should login with valid username and password
    And User click on Start New Application
    And User click on Water Affecting Activity Permits
    And User click on Well Construction Permit Application
    And User click on Continue Application
    And User click on Add new button
    And User fill the contact information page
    And User Selects the proposed work
    Then User selects the location details and water supply type of well
    Then User add attachment and reviews to record type
    And User pays the fees and click on next
    And User has successfully submit the application
    ##  | surendra.singh@sa./gov.au | sambroo |

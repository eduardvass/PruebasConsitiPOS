@Grid
Feature: Test different actions on a table page

  Rule: The user can return values from the table and validate them

  Background: Navigate to table webApp
    Given I navigate to the practice page
    And Go to Table test page

    @Smoke @Regression
  Scenario:  As a test engineer I want to validate the table is displayed
    Then I can validate the table is displayed

      @Regression
  Scenario:  As a test engineer I try out different actions on a table
    Then I can return the value I wanted
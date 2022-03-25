@Amazon
Feature: Test Amazon search functionality

  Scenario Outline: As a customer I want to search for a product and navigate to the third option on the second page and this has to be available to add to the cart
    Given The user navigates to Amazon page
    And Searches for <product>
    And Navigate to page 2
    And Selects the third Item
    Then The User is able to add it to the cart

    Examples:
    |product    |
    |Alexa      |
    |PlayStation|

@List
Feature: Test different actions on a list

  Scenario Outline: As a test engineer I want to validate that the text is present inside the list
    Given I navigate to the list page
    When I search <entry> in the list
    Then I can find <result> in the list

    Examples:
    |entry      |result             |
    |Washington |Seattle, Washington|
    |Chicago    |Chicago, Illinois  |
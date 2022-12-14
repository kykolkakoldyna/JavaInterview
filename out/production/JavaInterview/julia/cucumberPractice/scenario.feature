Feature: Login to the Application Under Test
  Scenario: Login to the application
    Given Open Chrome browser and launch application
    When User enters username to UserName field
    And User enters password to Password field
    And User clicks Login button
    Then Validate login was successful
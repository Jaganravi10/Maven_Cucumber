Feature: feature to test login fuctionality

  Scenario: Check login is successful with login credentials
    Given is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

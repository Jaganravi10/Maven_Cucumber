Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser opened
    And user is on login page
    When user enters valid <username> and <password>
    And user clicks on login
    Then user navigated to the home page

    Examples: 
      | username         | password |
      | mytest@gmail.com | Test@123 |

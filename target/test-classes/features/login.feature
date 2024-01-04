Feature: Test login functionality

  Scenario Outline: check the login page in successful with valid name and password
    Given browser is open
    And user click onlogin
    And user is on loginpage
    When user enters <username>and<password>
    Then user is navigated to the homepage

    Examples: 
      | username          |password|
      | mugesh1@gmail.com |Mugesh@1|

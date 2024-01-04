Feature: facebook application
  I want to facebook application

  Scenario: facebook login page
    Given user open thebrowser
    And user click thefacebook
    When user give thelogin username
    And user give thepassword
    And user click thesign button
    Then close the bowser
    

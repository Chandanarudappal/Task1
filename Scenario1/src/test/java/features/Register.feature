
Feature: Testing NewAccount Register fuctionality
 
  Scenario: open the chrome browser
    Given User will enter Practice page by clicking url
    And click the MyAccount bar
    When User enter valid Email 
    And enter Strong Password
    And click Register button
    Then Enter to Dashboard page 
    And Logout from the page

 
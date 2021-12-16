Feature: Testing login fuctionality

  Scenario: open browser
    Given user enter to Automation practice page
    And enter to MyAccount page
    When User enter the username 
    And Enter password with valid one
    And click to login
    Then enter to home page
    And click logout

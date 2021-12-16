Feature: Login fuctionality

  Scenario: Login to outlook
    Given User will enter the Outlook login page By clicking URL
    And click SignIN
    When Enter the LoginId
    And click Next
    And Enter password
    Then click LoginIn
    And click No

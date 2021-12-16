@tag
Feature: mail sending fuctionality

  @tag1
  Scenario: Login to outlook
    Given click url
    And click to SignIN button
    When add your LoginId
    And click on Next button
    And enter your password
    Then click on LoginIn button
    And click on No

  @tag2
  Scenario Outline: Sending Mail to recipient
    Given click on NewMail Button
    And add recipient name
    And click on CC
    When After opening CC add CCname
    And add subject to the mail
    Then Write the content
    And click send & verify mail is sent Successfully

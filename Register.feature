Feature: Register

  Background:
    Given user is on Sign Up page

  Scenario: Register Successfuly
    And user input email data
    And user input password data
    And user input phone number data
    When user click "Create Account"
    Then user should be redirected to homepage

  Scenario: Register Unsuccessfuly
    And user input username
    And user input password data
    And user input phone number data
    When user click "Please Complete Required Fields"
    Then Captcha pop up

  Scenario: Register using Google account
    When user click Sign up with Google
    Then user should be redirected to homepage
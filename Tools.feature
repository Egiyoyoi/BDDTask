Feature: Tools

  Background:
    Given user is on Home page

  Scenario: Tools button successfuly
    And user haven't registered
    When user click "Tools" menu
    Then user can get list from "Tools" menu

  Scenario: Cucumber Open button successfuly
    And user click "Tools" menu
    When user click "Cucumber Open" menu
    Then user get redirected to "cucumberopen" page

  Scenario Outline: Cucumber Studio button successfuly
    And user click "Tools" menu
    When user click "Cucumber Studio" menu
    Then user get redirected to "cucumberstudio" page
#Author: ichetanpawar@outlook.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Account types- login scenarios

  @ReleaseRegression 
  Scenario Outline: User is logging in and able to see home page
    Given User is landing on login page <TCID>
    When User enters <username> and <password>
    Then User verifies home page view
    Then User closes browser session

    Examples: 
      | TCID  | username | password   |
      | "100" | "Chetan" | "Temp@123" |

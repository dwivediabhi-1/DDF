#Author: abhishek.dwivedi@crestechsoftware.com
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
Feature: Login
  Description : This feature is to test the login functionality

  @tag1
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Click on My Account button
    And Enters the UserId and Password
    And clicks Login button
    Then He Lands on My Account Page
    
    
    @tag2
  Scenario Outline: Successful Login with Multiple Valid Credentials
    Given User is on DDF Home Page
    When User Click on Account button
    And Enters the UserId "<loginid>" and Password "<password>"
    And clicks Signin button
    Then He Lands on My Account Landing Page
    

    Examples: 
      | loginid 															| password  	|
      | abhishek.dwivedi@crestechsoftware.com | Abhishek@45 |
      | abhishek.dwivedi@crestechsoftware.com | Abhishek@45 |

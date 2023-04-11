#Author: your.email@your.domain.com
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

Feature: Click on Shop By Filters and Verify
  

  @tag3
  Scenario Outline: Use Filters on Basis of Category Price and Brands
    Given User goes on Home Page
    And User Clicks on any of the Category Menu
    When User Tries to Use Filters "<FilterType>"
    Then Selected Filters can be verified
    And Clear Filter is clicked
    
    Examples: 
      | FilterType|
      | Category	|
      | Brands 		|
      | Price 		|

 

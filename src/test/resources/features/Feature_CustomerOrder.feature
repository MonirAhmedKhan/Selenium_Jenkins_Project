
Feature: Customer orders Functionality
  Scenario: Customer Order total count Test
    Given  I logged in as a Customer
     |userId         |password|
     |david@gmail.com|1234    |
    When Click on Order List Menu
    And Verify Total Order count is greater than 800





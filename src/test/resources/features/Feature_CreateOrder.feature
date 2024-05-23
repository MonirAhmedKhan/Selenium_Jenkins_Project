
  Feature: Create Order Opearations

    Scenario Outline: Create Order by Customer
      Given I logged in as Customer "<userId>","<password>"
      Then I Click on Order product menu
      Then Select Product name
      And Enter Order Date
      And Click Order product button
      And Click Confirm Order
      Then Verify Order Status is Confirmed
    Examples:
      |userId         |password|
      |david@gmail.com|1234    |

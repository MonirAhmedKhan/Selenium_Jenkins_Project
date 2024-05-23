$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature_CreateOrder.feature");
formatter.feature({
  "name": "Create Order Opearations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create Order by Customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I logged in as Customer \"\u003cuserId\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I Click on Order product menu",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Product name",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Order Date",
  "keyword": "And "
});
formatter.step({
  "name": "Click Order product button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Confirm Order",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Order Status is Confirmed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ]
    },
    {
      "cells": [
        "david@gmail.com",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Order by Customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in as Customer \"david@gmail.com\",\"1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.i_logged_in_as_Customer(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Order product menu",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.i_click_on_order_product_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Product name",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.select_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Order Date",
  "keyword": "And "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.enter_order_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Order product button",
  "keyword": "And "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.click_order_product_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Confirm Order",
  "keyword": "And "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.click_confirm_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Order Status is Confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "step_Definitions.CreateOrderProduct.verify_order_status_is_confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Feature_CustomerOrder.feature");
formatter.feature({
  "name": "Customer orders Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer Order total count Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in as a Customer",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "step_Definitions.Customer_Orders.i_logged_in_as_a_Customer(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Order List Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_Definitions.Customer_Orders.click_on_order_list_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Total Order count is greater than 800",
  "keyword": "And "
});
formatter.match({
  "location": "step_Definitions.Customer_Orders.verify_total_order_count_is_greater_than(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
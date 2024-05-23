package step_Definitions;

import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CustomerHomePage_Page;
import pages.CustomerLogin_Page;
import pages.OrderList_Page;

import static org.junit.Assert.assertTrue;
public class Customer_Orders extends Base {

    @Given("I logged in as a Customer")
    public void i_logged_in_as_a_Customer(DataTable dataTable) {

        CustomerLogin_Page.loginAsCustomer(dataTable.cell(1, 0), dataTable.cell(1, 1));

    }
    @When("Click on Order List Menu")
    public void click_on_order_list_menu() {
    click(CustomerHomePage_Page.menuOrderList);
    }
    @When("Verify Total Order count is greater than {int}")
    public void verify_total_order_count_is_greater_than(Integer maxCount) {

     int totalOrderCunt =  getTotalElementsCount(OrderList_Page.tableRowsOrderList);
        System.out.println("Total Order Count is "+totalOrderCunt);
      assertTrue(totalOrderCunt>maxCount);

    }
}

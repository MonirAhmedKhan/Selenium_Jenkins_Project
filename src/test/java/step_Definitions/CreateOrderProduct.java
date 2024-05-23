package step_Definitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CustomerHomePage_Page;
import pages.CustomerLogin_Page;
import pages.OrderList_Page;
import pages.OrderProduct_Page;
import static org.junit.Assert.assertEquals;
public class CreateOrderProduct extends Base {
    @Given("I logged in as Customer {string},{string}")
    public void i_logged_in_as_Customer(String userId, String password) {
        CustomerLogin_Page.loginAsCustomer(userId,password);
    }
    @Then("I Click on Order product menu")
    public void i_click_on_order_product_menu() {
        click(CustomerHomePage_Page.menuOrderProduct);
    }
    @Then("Select Product name")
    public void select_product_name() {
        selectDropDownMenu(OrderProduct_Page.dropDownProductName,"Camera");
    }
    @Then("Enter Order Date")
    public void enter_order_date() {
        sendKeys(OrderProduct_Page.textBoxOrderDate,"05/18/2024");
    }
    @Then("Click Order product button")
    public void click_order_product_button() {
        click(OrderProduct_Page.buttonOrderProduct);
    }
    @And("Click Confirm Order")
    public void click_confirm_order() {
        click(OrderList_Page.LastColum);
    }
    @Then("Verify Order Status is Confirmed")
    public void verify_order_status_is_confirmed() {
     String  confirmedText =   getTextElement(OrderList_Page.textConfirmed);
     assertEquals("Confirmed",confirmedText);

    }

}

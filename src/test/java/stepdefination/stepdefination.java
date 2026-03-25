package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;

import java.util.List;


public class stepdefination {


    @Steps
    LoginSteps loginSteps;


    @Given("User is on the Swag Labs homepage And User login with user:")
    public void user_is_on_the_swag_labs_homepage_and_user_login_with_user(List<String> data) {
        loginSteps.onloginPage(data.get(0), data.get(1));

    }
    @When("User adds products to the cart {string} and {string}")
    public void user_adds_products_to_the_cart_and(String string1, String string2) {
        loginSteps.addProduct(string1, string2);
    }
    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        loginSteps.checkOut();
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters checkout data:")
    public void user_enters_checkout_data(List<String> data) {
        loginSteps.checkoutInfoDatafill(data.get(0), data.get(1), data.get(2));
    }
    @When("User completes the purchase")
    public void user_completes_the_purchase() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
        loginSteps.checkoutOverView();
    }
    @Then("User can see the order completion message")
    public void user_can_see_the_order_completion_message() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
        loginSteps.isThanku();
    }
    @Then("Cart should be empty after purchase")
    public void cart_should_be_empty_after_purchase() {
        // Write code here that turns the phrase above into concrete actions
      //./gradlew clean compileTestJava
        // throw new io.cucumber.java.PendingException();
        loginSteps.isThanku();
    }

}

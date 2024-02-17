package steps;

import actions.HomePageActions;
import actions.PaymentInfrastructurePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBAPaymentInfrastructureSteps {

    HomePageActions homePageActions = new HomePageActions();
    PaymentInfrastructurePageActions paymentInfrastructurePageActions = new PaymentInfrastructurePageActions();


    @Given("I am on the RBA website homepage {string}")
    public void i_am_on_the_rba_website_homepage(String url){

        HelperClass.openPage(url);

    }
    @When("I click on {string}")
    public void i_click_on(String string) {
        homePageActions.clickOnPayments_InfrastructureLink();
    }
    @Then("I verify that the page has updated information {string}")
    public void i_verify_that_the_page_has_updated_information(String string) {

        paymentInfrastructurePageActions.assertPaymentInfrastructureHeader();

    }
    @Then("I click on {string} from the left menu")
    public void i_click_on_from_the_left_menu(String string) {
        paymentInfrastructurePageActions.clickOnPaymentsSystemLink();
    }
    @Then("I click on {string} from the On This page list")
    public void i_click_on_from_the_on_this_page_list(String string) {
        paymentInfrastructurePageActions.assertPaymentSystemHeader();
        paymentInfrastructurePageActions.clickOnThisPageList();
        paymentInfrastructurePageActions.clickNonCashLink();
    }
    @Then("I verify that I am taken to the {string} section")
    public void i_verify_that_i_am_taken_to_the_section(String string) {
        paymentInfrastructurePageActions.assertNonCashHeader();
    }

}

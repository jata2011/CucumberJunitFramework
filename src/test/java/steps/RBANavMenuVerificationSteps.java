package steps;

import actions.FinancialStabilityPageActions;
import actions.HomePageActions;
import actions.PaymentInfrastructurePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;
import static utils.HelperClass.*;
import dataProviders.ConfigFileReader;


public class RBANavMenuVerificationSteps {

public RBANavMenuVerificationSteps(){
    varenvt = System.getenv("Environment");
    logger.info("env Value: " + varenvt);
    String configuredBrowser = ConfigFileReader.getProperty("browser");
    String configuredURL = ConfigFileReader.getProperty("testURL");
    logger.info("Configured browser: " + configuredBrowser);
    logger.info("Configured url: " + configuredURL);

}

    HomePageActions homePageActions = new HomePageActions();
    PaymentInfrastructurePageActions paymentInfrastructurePageActions = new PaymentInfrastructurePageActions();
    FinancialStabilityPageActions financialStabilityPageActions = new FinancialStabilityPageActions();



    @Given("I am on the RBA website homepage {string}")
    public void i_am_on_the_rba_website_homepage(String configuredURL){

       HelperClass.openPage(configuredURL);
    }

    @When("I click on {string}")
    public void i_click_on(String topMenuItem) {
        switch (topMenuItem) {
            case "Payments & Infrastructure":
                homePageActions.clickOnPayments_InfrastructureLink();
                break;
            case "Financial Stability":
                homePageActions.clickOnFinancialStabilityLink();
                break;
            default:
                //homePageActions.clickOnHomeReserveBankLogo();
                logger.info("i_click_on");

        }
    }
    @Then("I verify that the page has updated information {string}")
    public void i_verify_that_the_page_has_updated_information(String topMenuItem) {

        switch (topMenuItem) {
            case "Payments & Infrastructure":
                paymentInfrastructurePageActions.assertPaymentInfrastructureHeader();
                break;
            case "Financial Stability":
                financialStabilityPageActions.assertFinancialStabilityHeader();
                break;
            default:
                logger.info("i_verify_that_the_page_has_updated_information");

        }


    }
    @Then("I click on {string} from the left menu")
    public void i_click_on_from_the_left_menu(String subMenuItem) {
        switch (subMenuItem) {
            case "Payments System":
                paymentInfrastructurePageActions.clickOnPaymentsSystemLink();
                break;
            case "What is Financial stability":
                financialStabilityPageActions.clickOnWhatIsFinancialStabilityLink();
                break;
            default:
                logger.info("i_click_on_from_the_left_menu");

        }
    }
    @Then("I click on {string} from the On This page list")
    public void i_click_on_from_the_on_this_page_list(String childSubMenuItem) {

        switch (childSubMenuItem) {
            case "Non-cash Payments":
                paymentInfrastructurePageActions.assertPaymentSystemHeader();
                paymentInfrastructurePageActions.clickOnThisPageList();
                paymentInfrastructurePageActions.clickNonCashLink();
                break;
            case "Role of the Reserve Bank":
                financialStabilityPageActions.assertWhatIsFinancialStabilityHeader();
                financialStabilityPageActions.clickOnRoleOfReserveBankLink();
                break;
            default:
                logger.info("i_click_on_from_the_on_this_page_list");

        }

    }
    @Then("I verify that I am taken to the {string} section")
    public void i_verify_that_i_am_taken_to_the_section(String childSubMenuItem) {
        switch (childSubMenuItem) {
            case "Non-cash Payments":
                paymentInfrastructurePageActions.assertNonCashHeader();
                break;
            case "Role of the Reserve Bank":
                financialStabilityPageActions.assertRoleOfReserveBankHeader();
                break;
            default:
                logger.info("i_verify_that_i_am_taken_to_the_section");

        }
    }

}

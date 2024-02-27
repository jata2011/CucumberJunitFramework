package actions;


import org.openqa.selenium.support.PageFactory;
import locators.HomePageLocators;
import utils.HelperClass;


public class HomePageActions {

    HomePageLocators homePageLocators = null;

    public HomePageActions() {

        this.homePageLocators = new HomePageLocators();

        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }

    public void clickOnPayments_InfrastructureLink(){
        homePageLocators.paymentAndInfrastructure.click();
    }

    public void clickOnFinancialStabilityLink(){
        homePageLocators.financialStability.click();
    }

    public void clickOnHomeReserveBankLogo(){
        homePageLocators.reserveBankOfAustraliaLogo.click();
    }

}

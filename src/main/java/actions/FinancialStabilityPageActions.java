package actions;

import com.aventstack.extentreports.util.Assert;
import locators.FinancialStabilityPageLocators;
import locators.PaymentInfrastructurePageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class FinancialStabilityPageActions {

    FinancialStabilityPageLocators financialStabilityPageLocators = null;

    public FinancialStabilityPageActions() {

        this.financialStabilityPageLocators = new FinancialStabilityPageLocators();

        PageFactory.initElements(HelperClass.getDriver(),financialStabilityPageLocators);
    }

    public void assertFinancialStabilityHeader(){
        Assert.notNull(financialStabilityPageLocators.FinancialStabilityPageHeader,"Financial Stability Header not found");
    }

    public void clickOnWhatIsFinancialStabilityLink(){
        financialStabilityPageLocators.whatIsFinancialStabilityElement.click();
    }

    public void assertWhatIsFinancialStabilityHeader(){
        Assert.notNull(financialStabilityPageLocators.whatIsFinancialStabilityPageHeader,"About Financial Stability Header not found");
    }

    public void clickOnRoleOfReserveBankLink(){
        financialStabilityPageLocators.roleOfReserveBankElement.click();
    }

    public void assertRoleOfReserveBankHeader(){
        Assert.notNull(financialStabilityPageLocators.roleOfReserveBankHeader,"Role of the Reserve Bank in Maintaining Financial Stability Header not found ");
    }


}

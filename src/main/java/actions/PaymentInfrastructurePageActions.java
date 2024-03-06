package actions;

import com.aventstack.extentreports.util.Assert;
import locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import locators.PaymentInfrastructurePageLocators;
import utils.HelperClass;
public class PaymentInfrastructurePageActions {

    PaymentInfrastructurePageLocators paymentInfrastructurePageLocators = null;

    public PaymentInfrastructurePageActions() {

        this.paymentInfrastructurePageLocators = new PaymentInfrastructurePageLocators();

        PageFactory.initElements(HelperClass.getDriver(),paymentInfrastructurePageLocators);
    }

    public void assertPaymentInfrastructureHeader(){
        Assert.notNull(paymentInfrastructurePageLocators.paymentAndInfrastructureHeader,"Payment & Infrastructure Header not found on Payment & Infrastructure Page");
    }

    public void clickOnPaymentsSystemLink(){
        paymentInfrastructurePageLocators.paymentSystemLink.click();
    }

    public void assertPaymentSystemHeader(){
        Assert.notNull(paymentInfrastructurePageLocators.paymentSystemHeader,"Payments System Header not found on Payments System page");
    }

    public void clickOnThisPageList(){
        paymentInfrastructurePageLocators.OnThisDropDown.click();
    }

    public void clickNonCashLink(){
        paymentInfrastructurePageLocators.nonCashLink.click();
    }

    public void assertNonCashHeader(){
        Assert.notNull(paymentInfrastructurePageLocators.nonCashHeader,"Non Cash Header not displayed on Payments System page");
           
    }

}

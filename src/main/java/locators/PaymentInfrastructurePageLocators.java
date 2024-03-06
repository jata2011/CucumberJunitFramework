package locators;

import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class PaymentInfrastructurePageLocators {



    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Payments & Infrastructure')]")
    public WebElement paymentAndInfrastructureHeader;


    @FindBy(how = How.XPATH, using ="//a[@href='/payments-and-infrastructure/payments-system.html']")
    public WebElement paymentSystemLink;


    @FindBy(how = How.XPATH, using ="//h1[contains(.,'Payments System')]")
    public WebElement paymentSystemHeader;


    @FindBy(how = How.XPATH, using ="//h2[contains(.,'On This Page')]")
    public WebElement OnThisDropDown;


    @FindBy(how = How.XPATH, using ="//li[contains(.,'Cash')]")
    public List<WebElement> paymentList;


    @FindBy(how = How.XPATH, using ="//a[contains(.,'Non-cash Payments')]")  
    public WebElement nonCashLink;


    @FindBy(how = How.XPATH, using ="//h2[contains(.,'Non-cash Payments')]") 
    public WebElement nonCashHeader;

}


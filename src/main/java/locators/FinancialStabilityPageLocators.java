package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FinancialStabilityPageLocators {

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Financial Stability')]")
    public WebElement FinancialStabilityPageHeader;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'What is Financial Stability?')]")
    public WebElement whatIsFinancialStabilityElement;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'About Financial Stability')]")
    public WebElement whatIsFinancialStabilityPageHeader;

    @FindBy(how = How.XPATH, using = "(//a[contains(.,'Role of the Reserve Bank')])[2]")
    public WebElement roleOfReserveBankElement;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Role of the Reserve Bank in Maintaining Financial Stability')]")
    public WebElement roleOfReserveBankHeader;









}

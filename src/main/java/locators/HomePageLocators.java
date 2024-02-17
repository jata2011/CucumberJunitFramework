package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePageLocators {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Payments & Infrastructure')]")
    public WebElement paymentAndInfrastructure;


}

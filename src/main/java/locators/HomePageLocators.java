package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePageLocators {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Payments & Infrastructure')]")
    public WebElement paymentAndInfrastructure;

    @FindBy(how = How.XPATH, using = "//a[@href='/fin-stability/']")
    public WebElement financialStability;


    @FindBy(how = How.XPATH, using = "//img[contains(@alt,'Reserve Bank of Australia')]")
    public WebElement reserveBankOfAustraliaLogo;


}

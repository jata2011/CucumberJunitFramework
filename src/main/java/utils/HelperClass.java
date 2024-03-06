package utils;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 30;
   // public static String environmentFromYAML = null;
    public static String varenvt;
    public static final Logger logger = LogManager.getLogger(HelperClass.class);
    public static String configuredBrowser;
    public static String configuredURL;


    private HelperClass() {

        logger.info("Configured browser: " + configuredBrowser);
        logger.info("Configured url: " + configuredURL);
        logger.info("env Value: " + varenvt);

      switch (configuredBrowser){
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                logger.info("No browser has been provided");
        }



//        WebDriverManager.chromedriver().setup();
  //      driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {

        driver.get(url);
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void setUpDriver() {

        if (helperClass==null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            //driver.close(); // Don't use this otherwise websocket error will come : Ref - https://www.youtube.com/watch?v=g5ymn4SeOlg
            driver.quit();
        }

        helperClass = null;
    }

}
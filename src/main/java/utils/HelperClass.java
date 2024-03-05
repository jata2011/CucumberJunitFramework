package utils;

import java.time.Duration;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HelperClass {
    private static HelperClass helperClass;
    @Getter
    private static WebDriver driver;
    public final static int TIMEOUT = 30;

    public static String environmentFromYAML = null;
    public static String varenvt;

    public static final Logger logger = LogManager.getLogger(HelperClass.class);


    private HelperClass() {
        varenvt = System.getenv("Environment");
        logger.info("env Value: " + varenvt);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {

        driver.get(url);
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

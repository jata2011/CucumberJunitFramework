package runner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue={"steps"},
     //   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class CucumberRunnerTests {

    private static ExtentReports extent;

    @BeforeClass
    public static void setup() {
        // Initialize ExtentReports and attach the HTML reporter
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/extent-reports/extent-report.html");
        extent.attachReporter(spark);
    }

    @AfterClass
    public static void tearDown() {
        // Flush the reports and close ExtentReports
        extent.flush();
    }
}

package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue={"steps"},
        plugin = {"summary", "pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber-reports/Report.json", //report.json is to get cucumber report in azure devops
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome = true
)

public class CucumberRunnerTest {

}

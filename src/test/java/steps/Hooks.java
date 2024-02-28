package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.remote.http.WebSocket;
import utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks implements WebSocket.Listener {

   /* @Override
    public void onError(Throwable throwable) {
        // Handle WebSocket error
        System.out.println("WebSocket error occurred: " + throwable.getMessage());
        // Implement custom error handling, e.g., retry mechanism, logging, etc.
    }*/


    @Before
    public static void setUp() {

        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown(Scenario scenario) {

        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        HelperClass.tearDown();
    }
}

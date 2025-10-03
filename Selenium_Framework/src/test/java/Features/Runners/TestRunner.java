package Features.Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = "Steps",  // <-- Missing comma here
    plugin = {
        "pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "testng:target/testng-cucumber-reports/testng-results.xml"  // Generates TestNG-compatible report
    }
)  // <-- Removed trailing comma here
public class TestRunner {
}

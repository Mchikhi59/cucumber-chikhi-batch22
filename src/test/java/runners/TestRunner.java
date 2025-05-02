package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /// it has the path of feature directory/file
        features = "src/test/resources/features/",
        //the name of the package where step definitions are available
        glue = "steps",
        //it stops actual execution when set to true and scans all the steps
        //also, it provides missing step definitions
        //to start the execution, set the value of dryRun to false
        dryRun = false,
        tags = "@sprint",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}



)

public class TestRunner {
}

package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\Pratik\\IdeaProjects\\Cucumber1\\src\\main\\java\\Features\\login.feature",
                "C:\\Users\\Pratik\\IdeaProjects\\Cucumber1\\src\\main\\java\\Features\\customers.feature"},
        glue="stepDefinations",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                "html:test-output"},
        tags= "@sanity or @regression"



)
public class TestRunner {
}

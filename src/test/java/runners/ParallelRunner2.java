package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/report-parallel/report.html"
        },
        features = "src/test/resources/features/09_Parallel.feature",
        glue = {"stepdefinitions", "hooks"}
)
public class ParallelRunner2 {
}

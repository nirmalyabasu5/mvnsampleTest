package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:src//reports//htmlGeneratedReport.html"}
		)
public class CRMJunitRunner {

}

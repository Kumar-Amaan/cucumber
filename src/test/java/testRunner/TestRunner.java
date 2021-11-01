package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = { "steps" }, plugin = { "pretty",
		"json:target/json-report/cucumber.json", "json:jsonReport" }, dryRun = false, monochrome = true,
		tags = "@P123 and @setCookies"
//        name = "logo"
//        name="Advanced"

)
public class TestRunner {

}

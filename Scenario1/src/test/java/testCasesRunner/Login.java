package testCasesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\user\\eclipse-workspace\\Scenario1\\src\\test\\java\\features\\LoginToPage.feature",
		glue = "stepDefinitions",
		dryRun= false,
		monochrome = true,
		plugin = {"pretty", "html:test-output"}
		)
public class Login {

}

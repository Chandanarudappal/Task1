package testcasesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\user\\eclipse-workspace\\BDD_project\\src\\test\\java\\features\\Outlooklogin.feature",
		glue = "stepDefinitions",
		dryRun= false,
		monochrome = true,
		plugin = {"pretty","html:TestLogin-output"}
		
		)

public class OutlookLoginRunner {

}

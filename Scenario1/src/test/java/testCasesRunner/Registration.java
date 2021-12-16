package testCasesRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
	features= "C:\\Users\\user\\eclipse-workspace\\Scenario1\\src\\test\\java\\features\\Register.feature",
			glue = "stepDefinitions",
			dryRun= false,
			monochrome = true,
			plugin = {"pretty", "html:test-output"}
)
		
	public class Registration{
		
	}



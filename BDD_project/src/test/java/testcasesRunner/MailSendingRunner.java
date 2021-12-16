package testcasesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="C:\\Users\\user\\eclipse-workspace\\BDD_project\\src\\test\\java\\features\\MailSending.feature",
		glue = "stepDefinitions",
		dryRun= false,
		monochrome = true,
		plugin = {"pretty", "html:TestMailSending-output"}		
	)
public class MailSendingRunner {

}

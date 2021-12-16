package stepDefinitions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.RegisterStepDefinitionPage;
import resource.Base;


public class RegisterStepDefinition extends Base{
public WebDriver driver;
RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
@Test	
	@Given("^User will enter Practice page by clicking url$")
	public void user_will_enter_Practice_page_by_clicking_url() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	      driver =initializeDriver();
   
	}

	@And("^click the MyAccount bar$")
	public void click_the_MyAccount_bar() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://practice.automationtesting.in/my-account/");
	}

	@When("^User enter valid Email$")
	public void user_enter_valid_Email() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
		rsdp.getRegisterEmail().sendKeys("chandanarm1999@gmail.com");
	}
		
    @And("^enter Strong Password$")
    public void enter_Strong_Password() throws Exception{
    	RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
		rsdp.getRegisterPassword().sendKeys("*XYZyeahoo@1234$");
		
	}

	@And("^click Register button$")
	public void click_Register_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
		rsdp.clickRegister().click();
	    
	}

	@Then("^Enter to Dashboard page$")
	public void enter_to_Dashboard_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
		rsdp.clickHomepage().click();
	   	}

	@And("^Logout from the page$")
	public void logout_from_the_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
		rsdp.clicSignout().click();
	}
}

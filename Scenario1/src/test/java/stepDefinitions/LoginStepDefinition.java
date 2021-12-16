package stepDefinitions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LoginStepDefinitionPage;
import pageObject.RegisterStepDefinitionPage;
import resource.Base;
@RunWith(Cucumber.class)
public class LoginStepDefinition extends Base{
	public WebDriver driver;
	RegisterStepDefinitionPage rsdp= new RegisterStepDefinitionPage(driver);
@Test
	@Given("^user enter to Automation practice page$")
	public void user_enter_to_Automation_practice_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 driver =initializeDriver();	
	
	}

	@And("^enter to MyAccount page$")
	public void enter_to_MyAccount_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://practice.automationtesting.in/my-account/");
		
	}

	@When("^User enter the username$")
	public void user_enter_the_username_and_password_with_valid_one()  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginStepDefinitionPage lsdp= new LoginStepDefinitionPage(driver);
		lsdp.getUserName().sendKeys("chandanarm1999@gmail.com");
		
	}
	@And("^Enter password with valid one$")
	public void Enter_password_with_valid_one() throws Throwable{
		LoginStepDefinitionPage lsdp= new LoginStepDefinitionPage(driver);
		lsdp.getPassWord().sendKeys("*XYZyeahoo@1234$");
		
	}

	@And("^click to login$")
	public void click_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginStepDefinitionPage lsdp= new LoginStepDefinitionPage(driver);
		lsdp.clickLogin().click();
	}

	@Then("^enter to home page$")
	public void enter_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginStepDefinitionPage lsdp= new LoginStepDefinitionPage(driver);
		lsdp.clickHomepage().click();
	    
	}

	@And("^click logout$")
	public void click_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginStepDefinitionPage lsdp= new LoginStepDefinitionPage(driver);
		lsdp.clickLogout().click();

	}
}

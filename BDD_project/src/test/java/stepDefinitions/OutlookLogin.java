package stepDefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.OutlookLoginPage;
import resources.Base;

public class OutlookLogin extends Base{
public WebDriver driver;
	OutlookLoginPage olp = new OutlookLoginPage(driver);

@Test
	@Given("^User will enter the Outlook login page By clicking URL$")
	public void User_will_enter_the_Outlook_login_page_By_clicking_URL() throws Throwable {
		driver = initializeDriver();
		driver.get("https://outlook.live.com/owa/");	  
	}
	

	@And("^click SignIN$")
	public void click_SignIN() throws Throwable{
		OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.clickSignIn().click(); 
	}


	@When("^Enter the LoginId$")
	public void enter_the_loginid() throws Throwable {
		OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.getLoginID().sendKeys("yeahoo11@outlook.com");
	}
	@And("^click Next$")
	public void click_next() throws Throwable {
		OutlookLoginPage olp = new OutlookLoginPage(driver);	
		olp.clickNext().click();
	}
	@And("^Enter password$")
	public void enter_password() throws Throwable {
		OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.getPassword().sendKeys("*XYZyeahoo@1234$");
	}

	@Then("^click LoginIn$")
	public void click_loginin() throws Throwable {
		OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.clickLogin().click();
	}

	@And("^click No$")
	public void click_no() throws Throwable {
		OutlookLoginPage olp  = new OutlookLoginPage(driver);
		olp.clickNo().click();
		System.out.println("login successfully");
	}

}




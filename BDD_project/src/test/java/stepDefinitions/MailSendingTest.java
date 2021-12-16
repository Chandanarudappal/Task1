package stepDefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.MailSendingPage;
import pageObject.OutlookLoginPage;
import resources.Base;


public class MailSendingTest extends Base{
	public WebDriver driver;
	OutlookLoginPage olp = new OutlookLoginPage(driver);
	MailSendingPage msp = new MailSendingPage(driver);
@Test
	@Given("^click url$")
	public void click_url() throws Throwable {
		driver = initializeDriver();
		driver.get("https://outlook.live.com/owa/");
	}
	@And("^click to SignIN button$")
	public void click_to_SignIN_button() throws Throwable {
		//OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.clickSignIn().click();
	}
	@When("^add your LoginId$")
	public void add_your_LoginId() throws Throwable {
		//OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.getLoginID().sendKeys("yeahoo11@outlook.com");
	}
	@And("^click on Next button$")
	public void click_on_Next_button() throws Throwable {
		//OutlookLoginPage olp = new OutlookLoginPage(driver);	
		olp.clickNext().click();
	}
	@And("^enter your password$")
	public void enter_your_password() throws Throwable {
		//OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.getPassword().sendKeys("*XYZyeahoo@1234$");
	}
	@Then("^click on LoginIn button$")
	public void click_loginin() throws Throwable {
		//OutlookLoginPage olp = new OutlookLoginPage(driver);
		olp.clickLogin().click();
	}
	@And("^click on No$")
	public void click_on_No() throws Throwable {
		//OutlookLoginPage olp  = new OutlookLoginPage(driver);
		olp.clickNo().click();
		System.out.println("login successfully");
	}
	@Given("^click on NewMail Button$")
	public void click_on_newmail_button() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.clickNewMail().click();
	}
	@And("^add recipient name $")
	public void add_recipient_name() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.getRecipientName().sendKeys("xyzabc11@outlook.com");
	}
	@And("^click on CC$")
	public void click_on_cc() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.clickClickCC().click();
	}
	

	@When("^After opening CC add CCname$")
	public void after_opening_cc_add_ccname() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.getAddCC().sendKeys("efghi11@outlook.com");
	}
	@And("^add subject to the mail$")
	public void add_subject_to_the_mail() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.getSubject().sendKeys("Hello");
	}

	@Then("^Write the content$")
	public void write_the_content() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.getContent().sendKeys("Have a good day");
	}
	
	@And("^click send & verify mail is sent Successfully$")
	public void click_send_verify_mail_is_sent_successfully() throws Throwable {
		
		//MailSendingPage msp = new MailSendingPage(driver);
		msp.clickSend().click();
		System.out.println("mail sent successfully");
	}

}



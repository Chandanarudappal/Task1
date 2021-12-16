package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterStepDefinitionPage {
public WebDriver  driver;
	
	By MyAccount= By.id("menu-item-50");
	By RegisterEmail = By.id("reg_email");
	By RegisterPassword = By.id("reg_password");
	By Register = By.name("register");
	By Homepage = By.className("woocommerce");
	By Signout = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a");

	public RegisterStepDefinitionPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clickMyAccount() {
		return driver.findElement(MyAccount);	
	}
	public WebElement getRegisterEmail() {
		return driver.findElement(RegisterEmail);		
	}
	public WebElement getRegisterPassword(){
		return driver.findElement(RegisterPassword);
	}
	public WebElement clickRegister() {
		return driver.findElement(Register);	
	}
	public WebElement clickHomepage() {
		return driver.findElement(Homepage);
		
	}
	public WebElement clicSignout() {
		return driver.findElement(Signout);
		
	}
}

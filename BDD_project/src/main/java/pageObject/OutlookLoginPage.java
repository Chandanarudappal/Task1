package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutlookLoginPage {

	public WebDriver driver;

	By SignIn = By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a");
	By LoginID  = By.name("loginfmt");
	By Next = By.id("idSIButton9");
	By Password = By.name("passwd");
	By Login = By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[4]/div[2]/div/div/div/div/input");
	By No = By.id("idBtn_Back");
	

	public OutlookLoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement clickSignIn() {
		return driver.findElement(SignIn);
	}

	public WebElement getLoginID() {
		return driver.findElement(LoginID);	
	}
	public WebElement clickNext() {
		return driver.findElement(Next);		
	}
	public WebElement getPassword() {
		return driver.findElement(Password);	
	}
	public WebElement clickLogin() {
		return driver.findElement(Login);	
	}
	public WebElement clickNo() {
		return driver.findElement(No);		
	}
	
}


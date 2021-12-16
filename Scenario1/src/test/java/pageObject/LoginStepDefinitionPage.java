package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStepDefinitionPage {
	public WebDriver driver;
	  
	  By MyAccount = By.id("menu-item-50");
	  By UserName = By.id("username");
	  By PassWord = By.id("password");
	  By Login = By.name("login");
	  By Homepage = By.className("woocommerce");
	  By Logout = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a");

	  
	  public LoginStepDefinitionPage(WebDriver driver) {
			this.driver=driver;
		}
		public WebElement clickMyAccount() {
			return driver.findElement(MyAccount);	
		}
		public WebElement getUserName() {
			return driver.findElement(UserName);		
		}
		public WebElement getPassWord(){
			return driver.findElement(PassWord);
		}
		public WebElement clickLogin() {
			return driver.findElement(Login);		
		}
		public WebElement clickHomepage() {
			return driver.findElement(Homepage);		
		}
		public WebElement clickLogout() {
			return driver.findElement(Logout);
			
		}
	}



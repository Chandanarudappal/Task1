package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailSendingPage {
   public WebDriver driver;
	By NewMail = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/div/button/span");
	By RecipientName = By.xpath("//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/input");
	By ClickCC = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/button[1]");
	By AddCC = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/input");
    By Subject = By.id("TextField88");
    By Content = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div[1]");
    By Send = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/div/span/button[1]/span/span/span");
   
    public MailSendingPage(WebDriver driver) {
    	this.driver = driver;
    }
    public WebElement clickNewMail() {
		return driver.findElement(NewMail);
    }
    public WebElement getRecipientName() {
		return driver.findElement(RecipientName);   	
    }
    public WebElement clickClickCC() {
		return driver.findElement(ClickCC);   	
    }
    public WebElement getAddCC() {
		return driver.findElement(AddCC);   	
    }
    public WebElement getSubject() {
		return driver.findElement(Subject);   	
    }
    public WebElement getContent() {
		return driver.findElement(Content);   	
    }
    public WebElement clickSend() {
		return driver.findElement(Send);	
    	
    }
	
}


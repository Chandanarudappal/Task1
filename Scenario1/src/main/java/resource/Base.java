package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException, InterruptedException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Scenario1\\src\\test\\java\\features\\DataProperty");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	return driver;
	}
}

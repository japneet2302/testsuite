package mavendemo;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class App_Check_Login {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBinary("/opt/google/chrome/chrome");
		//chromeOptions.addArguments("--disable-dev-shm-usage");
		//chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--headless");
		//chromeOptions.setExperimentalOption("useAutomationExtension", false);
		//chromeOptions.addArguments("--disable-extensions");
		//chromeOptions.addArguments("disable-infobars");
		//chromeOptions.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver", "/home/japneet/Downloads/chromedriver_linux64/chromedriver");
	    driver = new ChromeDriver(chromeOptions);
	    
	  }
	
	 @Test
	    public void test() {
	    driver.get("http://localhost:5050/login-service/index.jsp");
		WebElement txtbx_username = driver.findElement(By.name("userName"));
		txtbx_username.sendKeys("demo1");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
		String expected_url = "http://localhost:5050/login-service/success.jsp";
		String actual_url = driver.getCurrentUrl();
		 if (expected_url.equals(actual_url));
		{ 
			System.out.println("Login Successful");
		
		}
		
	}
	 
	  @AfterMethod
	public void close() {
	    driver.close();
	  }

}

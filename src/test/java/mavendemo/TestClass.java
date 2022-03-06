package mavendemo;

import org.testng.annotations.AfterMethod;   
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class TestClass {
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
  public void testScript() {
    HomePage homePage = new HomePage(driver);
    homePage.open();
    assertTrue(homePage.isTitleCorrect());
  }

  @AfterMethod
  public void close() {
      driver.close();
    }
  
  
}
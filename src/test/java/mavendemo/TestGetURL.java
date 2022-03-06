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

 public class TestGetURL {

	 WebDriver driver;
    String actualTitle;

    @Test
    public void test() {
      driver.get("http://www.google.com");
       actualTitle = driver.getTitle();
       System.out.println("ActualTitle is " + actualTitle );
                     }
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
     @AfterMethod
	public void close() {
    	    driver.close();
      }
}
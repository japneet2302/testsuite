package mavendemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestURL {
  WebDriver driver;
  String url = "http://www.google.com";
  String title = "Google";

  public TestURL(WebDriver driver) {
    this.driver = driver;
  }

  public void open()  {
    driver.get(url);
  }

  public Boolean isTitleCorrect() {
    return driver.getTitle().equals(title);
  }

}
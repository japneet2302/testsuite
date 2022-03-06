package mavendemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HomePage {
  WebDriver driver;
  String url = "http://www.vpl.ca";
  String title = "Vancouver Public Library |";

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  public void open()  {
    driver.get(url);
  }

  public Boolean isTitleCorrect() {
    return driver.getTitle().equals(title);
  }
  public Boolean isUrlCorrect(String a, String e) {
	  return a.equals(e);
  }

}
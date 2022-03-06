package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App_Login {

	WebDriver driver;
	By username=By.name("userName");
	By password=By.name("password");
	By LoginButton=By.xpath("//input[@value='Login' and @type='submit']");
	


public App_Login (WebDriver driver) 
{
	this.driver=driver;
	
}

public void typeUserName ()
{
	WebElement txtbx_username = driver.findElement(By.name("userName"));
	txtbx_username.sendKeys("demo1");
}


public void typePassword ()
{
	driver.findElement(By.name("password")).sendKeys("1234");
}


public void clickOnLoginButton ()
{
	driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
}

}









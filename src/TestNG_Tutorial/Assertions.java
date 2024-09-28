package TestNG_Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver = new ChromeDriver();
  @Test (priority = 1)
  public void CloseBrowser() {
	  	driver.close();
	  	System.out.println("Driver Closed After Testing");
  }
  @Test (priority = 0)
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	  driver.get("https://www.saucedemo.com/");
	  String expectedTitle = "Swag Labs";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Titles of the website do not match");
  }
}

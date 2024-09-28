package TestNG_Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver = new ChromeDriver();
  @Test (priority = 2)
  public void closeBrowser() 
  {
	  driver.close();
	  System.out.println("Driver close after testing");
  }
  
  @Test (priority = 0)
  public void openBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  
  @Test (priority = 1)
  public void SoftAssertionEx()
  {
	  SoftAssert softAssert = new SoftAssert();
	  String expectedTitle = "Swag Labss";
	  String actualTitle = driver.getTitle();
	  softAssert.assertEquals(actualTitle,expectedTitle);
	  System.out.println("checking for the second title");
	  softAssert.assertEquals(actualTitle,"Swagg Labs");
	  softAssert.assertAll();
  }
}

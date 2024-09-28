package TestNG_Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  WebDriver driver = new ChromeDriver();
  @Parameters ({"Browser"})
  @BeforeTest
  public void setUp(String Browser) {
	  if(Browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe"); 
		  System.out.println("Chrome opened"); 
	  }
	  else
	  {
		  System.out.println("Fail to open browser");
	  }
	  driver.manage().window().maximize();
  }
  
  @Parameters({"URL"})
  @Test(priority = 1) 
  public void getURL(String URL) { 
      driver.get(URL); 
  }
  
  @Test(priority = 2) 
  public void getTitle() { 
      String title = driver.getTitle(); 
      System.out.println("Title of Webpage: " + title); 
  } 
  
  @AfterTest 
  public void close() { 
      driver.close(); 
  } 
}

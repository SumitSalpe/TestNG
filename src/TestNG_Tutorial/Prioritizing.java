package TestNG_Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prioritizing {
  WebDriver driver = new ChromeDriver();
  @Test(priority  = 1) 
  public void closeBrowser() 
  {
	  driver.close();
	  System.out.println("browser closed after testing");
  }
  
  @Test (priority = 0)
  public void openBrwser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	  driver.get("https://www.geeksforgeeks.org/");
	  driver.manage().window().maximize();
  }
}

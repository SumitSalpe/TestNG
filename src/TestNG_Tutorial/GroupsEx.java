package TestNG_Tutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsEx {
	WebDriver driver = new ChromeDriver();
	String title = "ToolsQA - Demo Website For Automation";
	
  @Test
  public void starting_point() {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	  System.out.println("This is the starting point of the test");
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/");
  }
  @Test(groups = {"demo"})
  public void checkTitle()
  {
	  String testTitle = "Free QA Automation Tools For Everyone";
	  String ogTitle = driver.getTitle();
	  Assert.assertEquals(ogTitle, testTitle);
  }
  @Test(groups = {"demo"})
  public void click_element()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement elements = driver.findElement(By.xpath("//h5[text() = 'Elements']"));
	  elements.click();
	  System.out.println("Clicked on elements");
  }
}

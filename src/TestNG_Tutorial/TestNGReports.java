package TestNG_Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGReports {

	WebDriver driver = new ChromeDriver();

	@Test
	public void Reports() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		String baseUrl = "https://www.toolsqa.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		String testTitle = "Tools QA";
		String ogTitle = driver.getTitle();
		System.out.println("og title is: " + ogTitle);
		Assert.assertEquals(ogTitle, testTitle);
	}
	@BeforeTest
	public void beforeMethod()
	{
		System.out.println("Starting Chrome Browser");
	}
	@AfterTest()
	public void afterTest()
	{
		driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}

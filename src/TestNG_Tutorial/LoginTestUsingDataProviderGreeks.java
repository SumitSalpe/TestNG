package TestNG_Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestUsingDataProviderGreeks {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "loginData", dataProviderClass = DataProviderExamplegreeks.class)
	public void testLogin(String username, String password) {
		try {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement usernameField = driver.findElement(By.id("user-name"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		usernameField.clear();
		passwordField.clear();

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL, "Login failed for user: " + username);
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("We are inside the catch block");
			System.out.println("NoSuchElementException has been handled");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

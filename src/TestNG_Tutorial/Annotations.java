package TestNG_Tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void testcase1() {
	  	System.out.println("This is a normal test case");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("This will execute before every Method");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("This will execute after every Method");
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("This will execute before the Class");
  }
  @AfterClass
  public void afterclass()
  {
	  System.out.println("This will execute after the Class");
  }
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("This will execute before the Test");
  }
  @AfterTest
  public void afterTest() {
    System.out.println("This will execute after the Test");
  }
  @BeforeSuite
  public void beforeSuite() {
    System.out.println("This will execute before the Test Suite");
  }
  @AfterSuite
  public void afterSuite() {
    System.out.println("This will execute after the Test Suite");
  }
}

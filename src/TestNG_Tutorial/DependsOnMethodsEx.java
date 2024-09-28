package TestNG_Tutorial;

import org.testng.annotations.Test;

public class DependsOnMethodsEx {
	@Test(dependsOnMethods = { "openBrowser" })
	public void SignIn() {
		System.out.println("This will execute second (SignIn)");
	}
	
	@Test
	public void openBrowser()
	{
		System.out.println("This will execute firt (openBrowser)");
	}
}

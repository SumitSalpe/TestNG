package TestNG_Tutorial;

import org.testng.annotations.Test;

public class MultipleDependentEx {
	@Test
	public void OpenBrowser() {
		System.out.println("Opening The Browser");
	}
	
	@Test (dependsOnMethods = {"SignIn","OpenBrowser"})
	public void logOut()
	{
		System.out.println("Logging Out");
	}
	
	@Test
	public void SignIn()
	{
		 System.out.println("Signing In");
	}
	
}

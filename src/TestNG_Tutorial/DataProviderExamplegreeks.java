package TestNG_Tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamplegreeks {
	@DataProvider(name = "loginData")
	public Object[][] provideLoginData() {
		return new Object[][] { { "standard_user", "secret_sauce" }, 
								{ "problem_user", "secret_sauce" }, 
								{ "visual_user", "secret_sauce" } };
	}
}

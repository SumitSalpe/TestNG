package TestNG_Tutorial;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod1() {
		return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } };
	}

	@Test (dataProvider = "data-provider")
	public void sum(int val1, int val2, int result) {
		int sum = val1+val2;
		Assert.assertEquals(result, sum);
	}
}

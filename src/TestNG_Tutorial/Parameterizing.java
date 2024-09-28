package TestNG_Tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizing {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int val1, float val2) 
  {
	  float Gst = val1 * val2;
	  System.out.println("The GST on val1 is  " + Gst);
  }
}

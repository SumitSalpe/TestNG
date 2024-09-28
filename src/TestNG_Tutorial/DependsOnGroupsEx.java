package TestNG_Tutorial;

import org.testng.annotations.Test;

public class DependsOnGroupsEx {
  @Test(dependsOnGroups = {"SignIn"})
  public void ViewAcc() {
      System.out.println("SignIn Successful");
  }
  @Test(groups = {"SignIn"})
  public void Login()
  {
	  System.out.println("groups will execute first");
  }
}

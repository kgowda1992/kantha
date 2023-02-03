package Sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base1
{
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to App");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from App");
	}

}

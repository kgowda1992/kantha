package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base
{
	@BeforeMethod
	public void login()
	{
		System.out.println("Logout from App");
	}
	@BeforeClass
	public void kkkk()
	{
		System.out.println("kkkkkkkkkkk");
	}
	@AfterClass
	public void rrrr()
	{
		System.out.println("rajjjjj");
	}
	

}

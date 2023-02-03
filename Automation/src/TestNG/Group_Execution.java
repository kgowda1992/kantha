package TestNG;

import org.testng.annotations.Test;

public class Group_Execution 
{
	@Test(groups = {"smoke"})
	public void createcustomer_staff()
	{
		System.out.println("create customer for staff");
	}
	@Test(groups = {"smoke","regression"})
	public void createcustomer_admin()
	{
		System.out.println("create customer for admin");
	}
	@Test(groups = {"regression"})
	public void createcustomer_user()
	{
		System.out.println("create customer for user");
	}

}

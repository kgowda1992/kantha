package Sample;

import org.testng.annotations.Test;

public class A 
{
	@Test(description = "Verify create customer for Rohit")
	public void createcustomer()
	{
		System.out.println("Create customer for Rohit");
	}
	@Test//(invocationCount = 5)
	public void deletecustomer()
	{
		System.out.println("Delete customer in Rohit");
	}
	@Test//(priority = -1)
	public void modifycustomer()
	{
		System.out.println("Modify customer for Rohit");
	}
	

}     

package TestNG;

import org.testng.annotations.Test;

public class Customer 
{
	@Test(dataProvider = "users" ,dataProviderClass =Data_control.User.class)
	public void createcustomer(String abcd,String xyz,String cust_name,String Cust_Desg)
	{
		System.out.println("Create customer for Amazon");
	}
	
}

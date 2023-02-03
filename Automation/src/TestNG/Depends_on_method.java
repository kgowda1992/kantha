package TestNG;

import org.testng.annotations.Test;

public class Depends_on_method 
{
	@Test
	public void Amazon_purchase()
	{
		System.out.println("purchase from amazon");
	}
	@Test(dependsOnMethods = {"Amazon_purchase"})
		public void Amazon_Payment()
		{
			System.out.println("Payment for Amazon");
		}
		
}



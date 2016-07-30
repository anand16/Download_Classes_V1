package Package.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alwaysrunExample {
	@Test
	public void Register()
	{
		System.out.println("Register");
		Assert.assertEquals("google", "gmail");
		//Assert.assertEquals("gmail", "gmail");
		
	}
	@Test(dependsOnMethods={"Register"},alwaysRun=true)
	public void login()
	{
		System.out.println("Login");
	}
	@Test(dependsOnMethods={"login"})
	public void placeorder()
	{
		System.out.println("Order");
	}
	
	@Test(dependsOnMethods={"placeorder"})
	public void logout()
	{
		System.out.println("Logout");
		
		
	}
	


	
	
	
	
	
	
	
	
}

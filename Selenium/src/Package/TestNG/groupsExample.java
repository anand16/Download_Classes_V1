package Package.TestNG;

import org.testng.annotations.Test;

public class groupsExample {
	@Test(groups={"Sanity","Regression"})
	public void Register()
	{
		System.out.println("Register");
	}
	@Test(groups={"Sanity"})
	public void Login()
	{
		System.out.println("Login");
	}
	@Test(groups={"Sanity"})
	public void placeorder()
	{
		System.out.println("Order");
	}
	@Test(groups={"Sanity"})
	public void logout()
	{
		System.out.println("Logout");
	}

}

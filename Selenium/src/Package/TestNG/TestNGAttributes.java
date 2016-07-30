package Package.TestNG;

import org.testng.annotations.Test;

public class TestNGAttributes {

	@Test(priority=1,enabled=true)
	public void login()
	{
		
		
	}
	@Test(priority=2,enabled=false)
	public void register()
	{
		
	}
	@Test(priority=3,enabled=true)
	public void logout()
	{
		
	}
}

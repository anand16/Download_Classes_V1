package PackageNewTours.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCaseOne {
    @Test
	public void LoginTest()
	{
    	FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com");
		LoginTours lt=PageFactory.initElements(driver, LoginTours.class);
		lt.FindAFlight("admin", "admin");
		
	}
}

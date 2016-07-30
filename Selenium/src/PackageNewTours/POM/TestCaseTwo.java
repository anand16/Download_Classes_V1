package PackageNewTours.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCaseTwo {
    @Test
	public void Misc()
	{
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com");
		
		LoginTours lit=PageFactory.initElements(driver, LoginTours.class);
		RegisterTours rit=PageFactory.initElements(driver, RegisterTours.class);
		CommonTours ct=PageFactory.initElements(driver, CommonTours.class);
		
		lit.register();
		Sleeper.sleepTightInSeconds(10);
		rit.RegisterInfo();;
		Sleeper.sleepTightInSeconds(10);
		ct.Home();
		Sleeper.sleepTightInSeconds(10);
		lit.FindAFlight("Admin", "Admin");
	}
}

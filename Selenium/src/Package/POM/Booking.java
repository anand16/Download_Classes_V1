package Package.POM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Booking extends Contants {
	//driver= new
	// @Parameters("browser")
	@Test
public void Transaction() //throws MalformedURLException
{
		/* DesiredCapabilities cap = null;
		 if(b.equals("Firefox"))
			 
		 {
			 cap=DesiredCapabilities.firefox();
			 cap.setBrowserName("firefox");
			 cap.setPlatform(Platform.WINDOWS);
			 
		 }*/
		 
	driver=new FirefoxDriver();
		// driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		// driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

	driver.get("http://newtours.demoaut.com");
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	lp.buttonclick();
	FindingFlight flite=PageFactory.initElements(driver,FindingFlight.class);
	flite.SelectCountry();
}
}

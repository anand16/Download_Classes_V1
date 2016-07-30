package Package.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class IEBrowserExample {

	@Test
	public void IEExample() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
	
	cap=DesiredCapabilities.internetExplorer();
	cap.setBrowserName("internet explorer");
	cap.setPlatform(Platform.WINDOWS);
	cap.setCapability(
		    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		    true);

	RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("http://yahoo.com");
	driver.manage().window().maximize();
	
	}
}

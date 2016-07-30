package Package.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeBrowserExample {

	@Test
	public void ChromeBrowser() throws MalformedURLException 
	{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		//RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		
	}
}

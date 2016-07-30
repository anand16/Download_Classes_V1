package Package.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExample {

	@Parameters("browser")
	@Test
	public void GMailTest(String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		
		/*if(b.equals("ie"))
		{
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("internet explorer");
			cap.setCapability(
				    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				    true);

			cap.setPlatform(Platform.WINDOWS);
		}*/
		

		 if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
					else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL
				            ("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("reach.seleniumprogramme");
		driver.findElement(By.id("next")).click();

}


}

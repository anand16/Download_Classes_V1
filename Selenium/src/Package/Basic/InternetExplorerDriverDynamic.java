package Package.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDriverDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
		// Set capability of IE driver to Ignore all zones browser protected mode settings. DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); // Initialize InternetExplorerDriver Instance using new capability. WebDriver driver = new InternetExplorerDriver(caps); 
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		caps.setCapability("EnableNativeEvents", false); 
		caps.setCapability("ignoreZoomSetting", true); // Initialize InternetExplorerDriver Instance using new capability. 
		// Press CTRL + 0 keys of keyboard to set IEDriver Instance zoom level to 100%. 
		
		 WebDriver driver = new InternetExplorerDriver(caps);
		 driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0")); 
		
		
		 driver.get("http://seleniumhq.org");
	}

}

package Package.LoadTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxLaunch {
	WebDriver driver= new FirefoxDriver();
	
		// TODO Auto-generated method stub

@Test(invocationCount=14,threadPoolSize=4)
public void login()
{
	System.out.println("[Start Thread]"+Thread.currentThread().getId());
	
driver.get("http://gmail.com");
driver.manage().window().maximize();
System.out.println("[End Thread]"+Thread.currentThread().getId());
//driver.quit();
}	

	}

	


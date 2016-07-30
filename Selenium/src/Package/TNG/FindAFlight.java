package Package.TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FindAFlight  extends Constants{
	@Test
	public void findFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.name("findFlights")).click();
		
	}
		

}

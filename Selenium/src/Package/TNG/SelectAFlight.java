package Package.TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SelectAFlight  extends Constants{
	@Test
	public void selectFlightTest()
	
	{
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
	}

}

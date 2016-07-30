package Package.TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class BookAFlight  extends Constants{
	@Test
	public void bookAflightTest()
	{
		Sleeper.sleepTightInSeconds(20);
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		Sleeper.sleepTightInSeconds(20);
		driver.findElement(By.name("creditnumber")).sendKeys("111111111111121");
		driver.findElement(By.name("buyFlights")).click();
	}

}

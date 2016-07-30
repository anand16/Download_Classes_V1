package Package.jut;

import org.junit.Test;
import org.openqa.selenium.By;


public class SelectAFlight  extends Constants{
	@Test
	public void selectFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
	}

}

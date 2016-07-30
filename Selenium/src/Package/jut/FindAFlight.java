package Package.jut;

import org.junit.Test;
import org.openqa.selenium.By;


public class FindAFlight  extends Constants{
	@Test
	public void findFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.name("findFlights")).click();
		
	}
		

}

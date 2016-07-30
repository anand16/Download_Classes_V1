package Package.jut;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight  extends Constants{
	@Test
	public void bookAflightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("creditnumber")).sendKeys("111111111111121");
		driver.findElement(By.name("buyFlights")).click();
	}

}

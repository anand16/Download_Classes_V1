package Package.TNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login  extends Constants{
	@Test
	public void loginTest()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}

}

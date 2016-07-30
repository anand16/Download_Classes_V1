package Package.Sync;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitAlert {
	FirefoxDriver driver= new FirefoxDriver();

@BeforeMethod
public void initialise()
{
		
driver.get("http://only-testing-blog.blogspot.in/2014/01/new-testing.html");
}
@Test
public void AlertMessage()
{
	driver.findElement(By.name("fname")).sendKeys("FirstName");
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
	String alrt=driver.switchTo().alert().getText();
	System.out.println(alrt);
	
}

@AfterMethod
public void teardown()
{
	driver.quit();
	
}

}

package Package.MultipleWindows;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MultipleWindowsFive {
public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	
	{
		
		driver = new FirefoxDriver();
		driver.get("http://bing.com");
	}
	
	
	@Test
	public void Logic()
	
	{
		String Title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		CallFunction("//*[@id='privacyLabel']");
		CallFunction("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a");

    }
	@Test
	public void CallFunction(String Xpath)
	{
		Set<String> windowsids= driver.getWindowHandles();
		Iterator<String> itr=windowsids.iterator();
		while(itr.hasNext())
			
		{
			driver.switchTo().window(itr.next());
			
			try
			
			{
				driver.findElement(By.xpath(Xpath)).click();
				
			}
			catch(Exception E)
			
			{
				
				
			}
			
		}
		
	}
	
	
	}
